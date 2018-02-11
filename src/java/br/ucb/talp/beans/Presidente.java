package br.ucb.talp.beans;

import java.io.Serializable;

/**
 *
 * @author uc11031397
 */
public class Presidente implements Serializable{
    public static final long serialVersionUID = 123456789L;
    
    private String nome;
    
    private String cpf;
    
    public Presidente(){}
    
    public Presidente(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Presidente){
            Presidente presidente = (Presidente) obj;
            if(presidente.getCpf().equals(getCpf()))
                    return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 89 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        return hash;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
