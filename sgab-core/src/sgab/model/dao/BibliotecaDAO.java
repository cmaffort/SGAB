/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;


import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dto.Biblioteca;
import sgab.model.dto.util.BibliotecaStatus;


public class BibliotecaDAO implements GenericDAO<Biblioteca, Long> {
    private static Map<Long, Biblioteca> bibliotecas = new HashMap<>();
    
    private static Long idSequence; //  gera identificador sequencial
    static {
        BibliotecaDAO.idSequence = 0L;
    }
    
    public static Long getNextId() {
        return BibliotecaDAO.idSequence++;
    }  
    
    @Override
    public void inserir(Biblioteca biblioteca){
        Long id = BibliotecaDAO.getNextId();
        biblioteca.setId(id);
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
    
    
    @Override
    public void alterar(Biblioteca biblioteca){
        biblioteca.setId(this.getNextId());
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
    
    public void alterarId(String nome,Long id){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                valor.setId(id);
                break;
            }
        }
    }
    
    public void alterarUnidadeOrg(String nome, String org){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                valor.setUnidadeOrg(org);
                break;
            }
        }
    }
    
    public void alterarNome(String nomeAntigo, String nomeNovo){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nomeAntigo)){
                valor.setNome(nomeNovo);
                break;
            }
        }
    }
   
    
    public void alterarStatus(String nome, BibliotecaStatus status){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                valor.setStatus(status);
                break;
            }
        }
    }
    
    @Override
    public Biblioteca pesquisar(Long key){
        return (this.bibliotecas.get(key));
    }
    
    @Override
    public List pesquisar(List listaparametro){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public Biblioteca pesquisar(String nome){
        Biblioteca resultado = new Biblioteca("temp","temp");
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                resultado = valor;
                break;
            }
        }
        return resultado;
    }
    
}
