 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author paulomaio
 */
public class Organizacao
{
    private String nome;
    private String NIF;
    private EnderecoPostal m_oEnderecoPostal;
    private String website;
    private String telefone;
    private String email;
    private Colaborador m_oGestor;
    private Set<Colaborador> m_lstColaboradores = new HashSet<Colaborador>();
            
    
    public Organizacao(String nome, String NIF, String website, String telefone, 
            String email, EnderecoPostal oMorada, Colaborador oColaborador)
    {
        if ( (nome == null) || (NIF == null) || (telefone == null) ||
                (email == null) || (oMorada == null) || (oColaborador == null) ||
                (nome.isEmpty())|| (NIF.isEmpty()) || (telefone.isEmpty()) || 
                (email.isEmpty()))
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        
        this.nome = nome;
        this.NIF = NIF;
        this.m_oEnderecoPostal = oMorada;
        this.website = website;
        this.telefone = telefone;
        this.email = email;
        this.m_oGestor = oColaborador;
        this.m_lstColaboradores.add(oColaborador);
       
    }
    
    public Colaborador getGestor()
    {
        return this.m_oGestor;
    }
   
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.NIF);
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
        Organizacao obj = (Organizacao) o;
        return (Objects.equals(NIF, obj.NIF));
    }
    
    @Override
    public String toString()
    {
        String str = String.format("%s - %s - %s - %s - %s - %s - %s", this.nome, this.NIF, this.website, this.telefone, this.email, this.m_oEnderecoPostal.toString(),this.m_oGestor.toString());
        return str;
    }
    
    public static Colaborador novoColaborador(String nome, String funcao, String telefone, String email)
    {
        return new Colaborador(nome,funcao,telefone,email);
    }
    
    public static EnderecoPostal novoEnderecoPostal(String local, String codPostal, String localidade)
    {
        return new EnderecoPostal(local,codPostal,localidade);
    }
    
    public boolean validaColaborador(Colaborador outroColaborador) {
        boolean validacao = true;
        if (outroColaborador.getNome() == null || outroColaborador.getEmail() == null || outroColaborador.getFuncao()== null || outroColaborador.getTelefone() == null) {
            return false;
        }
        return validacao;
    }

    public boolean addColaborador(Colaborador outroColaborador) {
        return this.m_lstColaboradores.add(outroColaborador);
    }
    
    public boolean registaColaborador(Colaborador outroColaborador) {
        
        if (this.validaColaborador(outroColaborador)){
            this.addColaborador(outroColaborador);
        }
        return false;
    }

    
}
