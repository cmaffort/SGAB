/*Author : @agatha
  FR002 -> Gestão de Unidades Organizacionais;
  FR002 -> Gestão de Unidades Organizacionais: Grupo D;
  FR002 -> Gestão de Unidades Organizacionais Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/

/*Get e Set rápido no NetBeans:
  Selecione as variáveis, Refactor, Encapsulade Fields, Next, após isso, vai aparecer um local com o botão Do Refactoring. :idea:*/
package sgab.model.dto;

public class UnidadeOrganizacionalDTO {
    private boolean habilitado = true;
    private long id;
    private String nome; 
    private String endereco;
    
    //CRIAR -> constructors 
    public UnidadeOrganizacionalDTO() {}
    
    public UnidadeOrganizacionalDTO(long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
        
    public UnidadeOrganizacionalDTO(boolean habilitado, long id, String nome, String endereco) {
        this.habilitado = habilitado;
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //EDITAR
    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //IMPRIMIR
    @Override
    public String toString() {
        return  "Habilitado = " + this.habilitado +
                ", ID = " + this.id +
                ", Nome = " + this.nome +
                ", Endereço = " + this.endereco;
    }
}
