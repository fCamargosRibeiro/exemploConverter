package br.ucb.talp.beans;

import java.io.Serializable;

/**
 *
 * @author uc11031397
 */
public class Empresa implements Serializable{
    public static final long serialVersionUID = 5467887L;
    
    private String nome;
    
    private String cnpj;
    
    private Presidente presidente;
    
    public Empresa(){
        setPresidente(new Presidente());
    }
    
    public Empresa(String nome, String cnpj){
        this();
        setNome(nome);
        setCnpj(cnpj);
    }
    
    public Empresa(String nome, String cnpj, Presidente presidente){
        this(nome, cnpj);
        setPresidente(presidente);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Empresa){
            Empresa empresa = (Empresa)obj;
            if(empresa.getCnpj().equals(getCnpj()))
                return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 11 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        hash = 11 * hash + (this.presidente != null ? this.presidente.hashCode() : 0);
        return hash;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }
}
