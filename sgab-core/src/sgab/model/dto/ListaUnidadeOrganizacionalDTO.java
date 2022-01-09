/*Author : @agatha
  FR002 -> Gestão de Unidades Organizacionais;
  FR002 -> Gestão de Unidades Organizacionais: Grupo D;
  FR002 -> Gestão de Unidades Organizacionais Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/

/*Get e Set rápido no NetBeans:
  Selecione as variáveis, Refactor, Encapsulade Fields, Next, após isso, vai aparecer um local com o botão Do Refactoring. :idea:*/
package dto;
import java.util.List;
import java.util.ArrayList;

public class ListaUnidadeOrganizacionalDTO {
    UnidadeOrganizacionalDTO unidadeDTO = new UnidadeOrganizacionalDTO();
    public List<UnidadeOrganizacionalDTO> listaUO = new ArrayList<>();
    
    //Constructors 
    public ListaUnidadeOrganizacionalDTO () {}
    public ListaUnidadeOrganizacionalDTO (UnidadeOrganizacionalDTO unidadeDTO) {}
    
    //IMPRIMIR
    @Override
    public String toString() {
        //ver listaDTO
        return "ListaUnidadeOrganizacionalDTO{" + "listaUO=" + listaUO + '}';
    }
    
    public void printarElemento(int posicao){
        //confere listaDTO
        System.out.println("Objeto da listaUo na posicao [" + posicao + "] = " 
                + listaUO.get(posicao));
    }
}
