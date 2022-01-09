
package sgab.model.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import sgab.model.dto.Obra;

public class ObraDAO implements GenericDAO<Obra, Integer>{
    private static Map<Integer, Obra> obras = new HashMap<>();

    
    @Override
    public void inserir(Obra entidade) {
        obras.put(entidade.getId(), entidade);
    }
    
    

    @Override
    public void alterar(Obra entidade) {
        obras.put(entidade.getId(), entidade);
    }

    @Override
    public Obra pesquisar(Integer key) {
        return obras.get(key);
    }

    @Override
    public List pesquisar(List parameterList) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public LinkedList<Obra> pesquisar(String titulo){
        LinkedList<Obra> resultados = new LinkedList();
        for (Map.Entry<Integer, Obra> pair : obras.entrySet()) {
            if(pair.getValue().getTitulo().equals(titulo)){
                resultados.add(pair.getValue());
            }
        }
        return resultados;
    }
    
    public List pesquisarAutor(String autor){
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
}