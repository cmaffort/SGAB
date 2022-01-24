/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.service;
import java.util.List;
import sgab.model.dao.AtendenteDAO;
import sgab.model.dto.Atendente;
import sgab.model.dto.util.AtendenteHelper;
import sgab.model.dto.util.AtendenteStatus;
import sgab.model.exception.NegocioException;
/**
 *
 * @author gabri
 */
public class GestaoAtendente {
    AtendenteDAO atendentes = new AtendenteDAO();
    Atendente atendente;

    public void cadastrarAutor(Atendente atendente){
        if (!AtendenteHelper.validarAtendente(atendente)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            atendentes.inserir(atendente);
        }
    }

    public void alterarAutor(Atendente atendente){
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
    public List<Atendente> listarAtivos(){
        return atendentes.listarAtivos();
    }
}   
