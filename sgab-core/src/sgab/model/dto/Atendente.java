/*Author : @agatha, @Gabriel Lucas
  FR005 -> Gestão de Atendentes;
  FR005 -> Gestão de Atendentes: Grupo D;
  FR005 -> Gestão de Atendentes: Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/

/*Get e Set rápido no NetBeans:
  Selecione as variáveis, Refactor, Encapsulade Fields, Next, após isso, vai aparecer um local com o botão Do Refactoring. :idea:*/

/*Constructor rápido no netbeans: 
  Click botão direito, insert Code, constructor, selecionar variaveis (ou deixar vazio), generate*/

package sgab.model.dto;
import sgab.model.dto.util.AtendenteStatus;

public class Atendente extends Pessoa{
    private String gestor; 
    //public Atendente(){}
    private AtendenteStatus status;
    public Atendente(Long cpf, String login, String nome, String email, String senha,String status,String gestor){
        super(cpf,login,nome,email,senha);
        this.status = AtendenteStatus.ATIVO;
        this.gestor = gestor;
    }
    
    public AtendenteStatus getStatus() {
        return status;
    }

    public void setStatus(AtendenteStatus status) {
        this.status = status;
    }
    
    public String getGestor(){
        return this.gestor;
    }
    
}