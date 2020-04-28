/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.Objects;

/**
 *
 * @author paulomaio
 */
public class Colaborador
{
    private String nome;
    private String funcao;
    private String telefone;
    private String email;
            
    
    public Colaborador(String nome, String funcao, String telefone, String email)
    {
        if ( (nome == null) || (funcao == null) || (telefone == null) || (email == null) ||
                (nome.isEmpty())|| (funcao.isEmpty())|| (telefone.isEmpty())|| (email.isEmpty()))
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        
        this.nome = nome;
        this.funcao = funcao;
        this.telefone = telefone;
        this.email = email;
    }
    
    public boolean hasId(String strId)
    {
        return this.email.equalsIgnoreCase(strId);
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getEmail()
    {
        return this.email;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
   
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        // Inspirado em https://www.sitepoint.com/implement-javas-equals-method-correctly/
        
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        // field comparison
        Colaborador obj = (Colaborador) o;
        return (Objects.equals(email, obj.email));
    }
    
    @Override
    public String toString()
    {
        return String.format("%s - %s - %s - %s", this.nome, this.funcao, this.telefone, this.email);
    }
}
