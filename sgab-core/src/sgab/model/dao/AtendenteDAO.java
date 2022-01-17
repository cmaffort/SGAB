package sgab.model.dao;


import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dto.Atendente;
import sgab.model.dto.util.AtendenteStatus;
import sgab.model.exception.PersistenciaException;
import sgab.util.PasswordDigest;

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

    private AtendenteDAO() {}

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

        table.put(atendenteId, atendente);
    }

    @Override
    public void alterar(Atendente atendente) {
        Atendente usr = table.remove(atendente.getId());
        if (usr == null)
            throw new PersistenciaException("Nenhum usuário com "
                    + "o id '" + atendente.getId() + "'.");

        inserir(atendente);
    }

    @Override
    public Atendente pesquisar(Long id) {
        return table.get(id);
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

        listAtendentes.addAll(table.values());

        return listAtendentes;
    }

    public List<Atendente> listarAtivos() {
        List<Atendente> listAtendentes = new ArrayList<>();

        for (Atendente atd: table.values())
            if (atd.getStatus() == AtendenteStatus.ATIVO) // lista apenas os usuários ativos
                listAtendentes.add(atd);

        return listAtendentes;
    }

    @Override
    public List<Atendente> pesquisar(List<BasicPair<Long, Atendente>> parameterList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Long id){
        Atendente atendente = pesquisar(id);
        atendente.setStatus(AtendenteStatus.DESABILITADO);
    }
}
