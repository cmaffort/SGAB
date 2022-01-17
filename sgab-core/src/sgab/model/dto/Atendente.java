/*Author : @agatha
  FR005 -> Gestão de Atendentes;
  FR005 -> Gestão de Atendentes: Grupo D;
  FR005 -> Gestão de Atendentes: Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/

/*Get e Set rápido no NetBeans:
  Selecione as variáveis, Refactor, Encapsulade Fields, Next, após isso, vai aparecer um local com o botão Do Refactoring. :idea:*/

/*Constructor rápido no netbeans: 
  Click botão direito, insert Code, constructor, selecionar variaveis (ou deixar vazio), generate*/

package sgab.model.dto;
import sgab.model.dto.Gestor;
import sgab.model.dto.util.AtendenteStatus;
import sgab.model.dto.util.UsuarioStatus;

public class Atendente extends Pessoa{
    private Gestor gestor;
    private AtendenteStatus status;

    public AtendenteDTO(){}

    public Atendente(Gestor gestor) {
        this.gestor = gestor;
    }

    public Gestor getGestor(){
        return this.gestor;
    }

    public AtendenteStatus getStatus() {
        return status;
    }

    public void setStatus(AtendenteStatus status) {
        this.status = status;
    }

}