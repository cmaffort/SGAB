package sgab.model.dto;

public class Assunto {
    String nome;
    Long id;

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}