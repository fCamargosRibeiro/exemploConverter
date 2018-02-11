package br.ucb.talp.dao;

import br.ucb.talp.beans.Presidente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uc11031397
 */
public class PresidenteDAOimpl implements Serializable, PresidenteDAO{

    @Override
    public List<Presidente> findAll() {
        List<Presidente> presidentes = new ArrayList<Presidente>();
        presidentes.add(new Presidente("Leonardo", "1234567890"));
        presidentes.add(new Presidente("Maria", "567"));
        presidentes.add(new Presidente("João", "678986756545673456"));
        
        return presidentes;
    }

    @Override
    public Presidente findByCpf(String cpf) {
        for(Presidente presidente : findAll()){
            if(presidente.getCpf().equals(cpf))
                return presidente;
        }
        
        return null;    
    }
    
}
