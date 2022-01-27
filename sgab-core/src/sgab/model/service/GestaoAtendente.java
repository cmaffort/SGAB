package sgab.model.service;
import java.util.List;
import sgab.model.dao.AtendenteDAO;
import sgab.model.dto.Atendente;
import sgab.model.dto.util.AtendenteHelper;
import sgab.model.dto.util.AtendenteStatus;
import sgab.model.exception.NegocioException;
import sgab.model.dao.PessoasDAO;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaHelper;
/**
 *
 * @author gabri
 */
public class GestaoAtendente {
    private PessoasDAO pessoasDAO;
    AtendenteDAO atendentes = new AtendenteDAO();
    Atendente atendente;

    public void cadastrarAtendente(Atendente atendente){
        if (!AtendenteHelper.validarAtendente(atendente)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            atendentes.inserir(atendente);
        }
    }

    public void alterarAtendente(Atendente atendente){
        if (!AtendenteHelper.validarAtendente(atendente)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            atendentes.alterar(atendente);
        }
    }

    public Atendente pesquisarId(Long id){
        if (!AtendenteHelper.validarId(id)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            return atendentes.pesquisar(id);
        }
    }

    public void removerAtendente(Long id){
        if (!AtendenteHelper.validarId(id)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            atendentes.remover(id);
        }
    }
    public List<Atendente> pesquisarAtendentesAtivos(){
        return atendentes.listarAtivos();
    }
    public Pessoa pesquisarPorLogin(String login){
        Pessoa result = pessoasDAO.pesquisarLogin(login);
        return result;
    }

}