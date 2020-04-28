/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import pt.ipp.isep.dei.esoft.pot.model.Colaborador;
import pt.ipp.isep.dei.esoft.pot.model.Organizacao;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

/**
 *
 * @author sofiamercos
 */
public class EspecificarColaboradorController {

    private Organizacao m_oOrganizacao;
    private Colaborador m_oColaborador;

    
    public boolean novoColaborador(String nome, String funcao, String telefone, String email){
       try
        {
            Colaborador Colab = Organizacao.novoColaborador(nome, funcao, telefone, email);  
            this.m_oColaborador = Organizacao.novoColaborador(nome, funcao, telefone, email);
            return this.m_oOrganizacao.validaColaborador(this.m_oColaborador);
        }
        catch(RuntimeException ex)
        {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            this.m_oColaborador = null;
            return false;
        }
    } 
    
    public boolean RegistaColaborador(){
        return this.m_oOrganizacao.registaColaborador(this.m_oColaborador);
        
    }
    
}
