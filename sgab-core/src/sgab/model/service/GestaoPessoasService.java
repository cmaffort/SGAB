package sgab.model.service;

import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaHelper;
/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class GestaoPessoasService {

    void cadastrarPessoa(Pessoa pessoa) {

        if (!PessoaHelper.validarPessoa(pessoa))
            throw new RuntimeException("Os dados da pessoa não são válidos");
        
        // chamar dao de pessoa para persistir dado
            
    }
    
}
