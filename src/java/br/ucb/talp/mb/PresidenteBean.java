package br.ucb.talp.mb;

import br.ucb.talp.beans.Presidente;
import br.ucb.talp.dao.PresidenteDAO;
import br.ucb.talp.dao.PresidenteDAOimpl;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author uc11031397
 */
@ManagedBean
@RequestScoped
public class PresidenteBean implements Serializable{
    private PresidenteDAO presidenteDAO;
    
    public PresidenteBean(){
        setPresidenteDAO(new PresidenteDAOimpl());
    }
    
    public List<Presidente> getPresidentes(){
        return getPresidenteDAO().findAll();
    }
    
    public void setPresidenteDAO(PresidenteDAO presidenteDAO) {
        this.presidenteDAO = presidenteDAO;
    }

    public PresidenteDAO getPresidenteDAO() {
        return presidenteDAO;
    }
}
