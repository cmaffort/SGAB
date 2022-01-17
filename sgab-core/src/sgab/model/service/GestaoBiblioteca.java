package sgab.model.service;

/**
 *
 * @author Victor Schneider
 */

import sgab.model.dto.Biblioteca;
import sgab.model.dao.BibliotecaDAO;
import sgab.model.dto.util.BibliotecaHelper;
import java.util.List;
import sgab.model.dto.util.BibliotecaStatus;

public class GestaoBiblioteca{
    
    BibliotecaDAO bibliotecas = new BibliotecaDAO();
    Biblioteca biblioteca;
    
    public void cadastrarBiblioteca(Biblioteca biblioteca){
        if(BibliotecaHelper.validarBiblioteca(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.inserir(biblioteca);
        }
    }
    
    public void alterarBiblioteca(Biblioteca biblioteca){
       if(BibliotecaHelper.validarBiblioteca(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.alterar(biblioteca);
        } 
    }
    
    public void alterarId(String nome, Long id){
       if(BibliotecaHelper.validarId(id)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.alterarId(nome,id);
        } 
    }
    
    public void alterarNome(String nomeAntigo, String nomeNovo){
       if(BibliotecaHelper.validarNome(nomeNovo)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.alterarNome(nomeAntigo,nomeNovo);
        } 
    }


    public void alterarUnidadeOrganizacional(String nome, String org){
       if(BibliotecaHelper.validarNome(org)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.alterarNome(nome,org);
        } 
    }
    
    public void alterarStatus(String nome, BibliotecaStatus status){
       if(status == BibliotecaStatus.SUSPENSA){
            throw new RuntimeException("Biblioteca suspensa!");
        }
        else{
            bibliotecas.alterarStatus(nome,status);
        } 
    } 
    
    public Biblioteca pesquisarId(Long id){
       if(BibliotecaHelper.validarId(id)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            return bibliotecas.pesquisar(id);
        } 
    }
    
    public Biblioteca pesquisarNome(String nome){
       if(BibliotecaHelper.validarNome(nome)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            return bibliotecas.pesquisar(nome);
        } 
    }
    
}
