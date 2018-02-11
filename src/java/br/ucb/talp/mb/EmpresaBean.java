package br.ucb.talp.mb;

import br.ucb.talp.beans.Empresa;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author uc11031397
 */
@ManagedBean
@RequestScoped
public class EmpresaBean implements Serializable{
    private Empresa empresa;
    
    private boolean check;

    public EmpresaBean(){
        setEmpresa(new Empresa());
    }
    
    public String salvar(){
        if(getEmpresa().getNome().contains("botafogo")){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Contem o flamengo!"));
            return "index.xhtml";
        }    
        return "APRESENTACAO";
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
    public boolean isCheck() {
        return check;
    }

    public void validaNomeNotFla(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value!=null){
            String nome = value.toString();
            if(nome.contains("flamengo")){
                throw new ValidatorException(new FacesMessage("Valor contém o tal do Flamengo!"));
            }
        }
    }
}