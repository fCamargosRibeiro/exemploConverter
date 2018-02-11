package br.ucb.talp.converter;

import br.ucb.talp.beans.Presidente;
import br.ucb.talp.dao.PresidenteDAO;
import br.ucb.talp.dao.PresidenteDAOimpl;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author uc11031397
 */
@FacesConverter("presidenteConverter")
public class PresidenteConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(!(value.isEmpty() && value == null)){
            PresidenteDAO dao = new PresidenteDAOimpl();
            return dao.findByCpf(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null && value instanceof Presidente){
            return ((Presidente)value).getCpf();
        }
        
        return null;
    }
    
}
