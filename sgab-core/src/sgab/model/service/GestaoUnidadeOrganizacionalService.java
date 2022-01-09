/*Author : @agatha
  FR002 -> Gestão de Unidades Organizacionais;
  FR002 -> Gestão de Unidades Organizacionais: Grupo D;
  FR002 -> Gestão de Unidades Organizacionais Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/
package sgab.model.service;
import java.util.Scanner;
import sgab.model.dto.UnidadeOrganizacionalDTO;
import sgab.model.dto.ListaUnidadeOrganizacionalDTO;
import sgab.model.dto.util.UnidadeOrganizacionalHelper;

public class GerenciarUnidadeOrganizacional {
    Scanner sc = new Scanner(System.in);
    UnidadeOrganizacionalDTO unidadeDTO = new UnidadeOrganizacionalDTO();
    ListaUnidadeOrganizacionalDTO listaDTO = new ListaUnidadeOrganizacionalDTO();
    
    public void adicionarUnidade(){
        System.out.println("Inserir dados:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        unidadeDTO.setNome(nome);
        
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        unidadeDTO.setNome(endereco);
        
        System.out.print("ID: ");
        System.out.println(listaDTO.listaUO.size());
        unidadeDTO.setId(listaDTO.listaUO.size());
        
        System.out.println("CONFERE unidadeDTO");
        System.out.println(unidadeDTO.toString());
        
        System.out.println("CONFERE listaDTO");
        if(UnidadeOrganizacionalHelper.validarUnidadeOrganizacional(unidadeDTO)){
            listaDTO.listaUO.add(unidadeDTO);
            listaDTO.printarElemento(listaDTO.listaUO.size());
        }else{
            throw new RuntimeException("Dados Inválidos!");
        }
    }
     
    public void editarUnidade(){
        //AJUDAR MAFFORT : COMO MODIFICAR ITEM NO ARRAYLIST???
        int posicao = pesquisarUnidade();
        //GAMBIARRA:
        System.out.println("Modificar dados:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        unidadeDTO.setNome(nome);
        
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        unidadeDTO.setNome(endereco);
        unidadeDTO.setId(posicao);
        if(UnidadeOrganizacionalHelper.validarUnidadeOrganizacional(unidadeDTO)){
            listaDTO.listaUO.remove(posicao);
            listaDTO.listaUO.add(posicao, unidadeDTO);
        }else{
            throw new RuntimeException("Dados Inválidos!");
        }

    }
    
    public void des_habilitarUnidade(){
        //"remover"
        int posicao = pesquisarUnidade();
        if(unidadeDTO.getHabilitado() == true){
            unidadeDTO.setHabilitado(false);
        }else{
            unidadeDTO.setHabilitado(true);
        }
        listaDTO.listaUO.remove(posicao);
        listaDTO.listaUO.add(posicao, unidadeDTO);
    }
    
    public int pesquisarUnidade(){
        System.out.println("Pesquisar Por:\n"
                + "1 - nome\n"
                + "2 - id");
                int op = sc.nextInt();
        int posicao=0; 
        switch (op){
            case 1:
                System.out.print("digite nome: ");
                String nome = sc.nextLine();
                posicao = listaDTO.listaUO.indexOf(nome);
                break;
            case 2:
                System.out.print("digite codigo: ");
                long id = sc.nextInt();
                posicao = listaDTO.listaUO.indexOf(id);
                break;
        }
        listaDTO.printarElemento(posicao);
        return posicao;
    }    
        
    public void verListaUnidades(){
        listaDTO.toString();
    }
}
