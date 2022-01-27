package sgab.model.dao;


import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dao.AtendenteDAO;
import sgab.model.dto.util.AtendenteStatus;
import sgab.model.exception.PersistenciaException;
import sgab.util.PasswordDigest;
import sgab.model.dto.Atendente;
/**
 * GRUPO D
 * @author Letícia Araújo
 */
public class AtendenteDAO implements GenericDAO<Atendente, Long> {

    private static Map<Long, Atendente> atendentes = new HashMap<>();

    private static AtendenteDAO atendenteDAO;
    static{
        AtendenteDAO.atendenteDAO = null;
    }

    private static Long idSequence;
    static {
        AtendenteDAO.idSequence = 0L;
    }

    public static Long getNextId() {
        return AtendenteDAO.idSequence++;
    }

    public AtendenteDAO() {}

    //getInstance

    @Override
    public void inserir(Atendente atendente) {
        if (pesquisarLogin(atendente.getLogin()) != null)
            throw new PersistenciaException("'" + atendente.getLogin()
                    + "' é único.");
        Long atendenteId = AtendenteDAO.getNextId();
        atendente.setId(atendenteId);

        String atendentePasswd = PasswordDigest.passwordDigestMD5(atendente.getSenha());
        atendente.setSenha(atendentePasswd);

        atendentes.put(atendenteId, atendente);
    }

    @Override
    public void alterar(Atendente atendente) {
        Atendente usr = atendentes.remove(atendente.getId());
        if (usr == null)
            throw new PersistenciaException("Nenhum usuário com "
                    + "o id '" + atendente.getId() + "'.");

        inserir(atendente);
    }

    @Override
    public Atendente pesquisar(Long atendenteId) {
        return atendentes.get(atendenteId);
    }

    public Atendente pesquisarLogin(String login) {
        List<Atendente> listUsuario = listarTodos();
        for (Atendente atd: listUsuario)
            if (atd.getLogin().equals(login))
                return atd;

        return null;
    }

    public Atendente pesquisarLoginSenha(String login, String senha) {
        Atendente atd = pesquisarLogin(login);

        String passwd = PasswordDigest.passwordDigestMD5(senha);

        if (atd.getSenha().equals(passwd))
            return atd;

        return null;
    }

    public List<Atendente> listarTodos() {
        List<Atendente> listAtendentes = new ArrayList<>();

        listAtendentes.addAll(atendentes.values());

        return listAtendentes;
    }

    public List<Atendente> listarAtivos() {
        List<Atendente> listAtendentes = new ArrayList<>();

        for (Atendente atd: atendentes.values())
            if (atd.getStatus() == AtendenteStatus.ATIVO) // lista apenas os usuários ativos
                listAtendentes.add(atd);

        return listAtendentes;
    }

    @Override
    public List<Atendente> pesquisar(List<BasicPair<Long, Atendente>> parameterList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remover(Long id){
        Atendente atendente = pesquisar(id);
        atendente.setStatus(AtendenteStatus.DESABILITADO);
    }
}