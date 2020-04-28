/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

/**
 *
 * @author edu-c
 */
public class Obrigatoriedade {
    private boolean obrigatoriedade;

    public Obrigatoriedade(boolean obrigatoriedade) {
        this.obrigatoriedade = obrigatoriedade;
    }

    public boolean isObrigatoriedade() {
        return obrigatoriedade;
    }

    public void setObrigatoriedade(boolean obrigatoriedade) {
        this.obrigatoriedade = obrigatoriedade;
    }

    @Override
    public String toString() {
        return "Obrigatoriedade{" + "obrigatoriedade=" + obrigatoriedade + '}';
    }
    
    
    
    
    
    
    
    
}
