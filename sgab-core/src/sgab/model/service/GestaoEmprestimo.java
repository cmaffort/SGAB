package sgab.model.service;

import java.util.List;
import sgab.model.dao.EmprestimosDAO;

import sgab.model.dao.PessoasDAO;
import sgab.model.dto.Exemplar;
import sgab.model.dto.Obra;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.EmprestimoHelper;
import sgab.model.dto.util.ExemplarStatus;
import sgab.model.exception.NegocioException;


public class GestaoEmprestimo {
    private PessoasDAO pessoasDAO;
    
    public void RealizarEmprestimo(Exemplar exemplar,Pessoa leitor){

        EmprestimosDAO emprestimosDAO = new EmprestimosDAO();
        List<String> errosLeitor = EmprestimoHelper.validarLeitor(leitor, pessoasDAO);
        List<String> erros = EmprestimoHelper.validarEmprestimo(exemplar);
        
        if(!erros.isEmpty()){
            throw new NegocioException(erros);
        }else if(!errosLeitor.isEmpty()){
            throw new NegocioException(errosLeitor);
        }
        
        exemplar.setStatus(ExemplarStatus.EMPRESTADO);
        emprestimosDAO.inserir(exemplar,leitor);
    }
    
}