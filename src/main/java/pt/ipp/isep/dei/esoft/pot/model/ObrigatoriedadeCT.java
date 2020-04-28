/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;


public class ObrigatoriedadeCT {
    private CompetenciaTecnica comp;
    private boolean obrgComp;

    public ObrigatoriedadeCT(CompetenciaTecnica comp, boolean obrgComp) {
        this.comp = comp;
        this.obrgComp = obrgComp;
    }

    public CompetenciaTecnica getComp() {
        return comp;
    }

    public void setComp(CompetenciaTecnica comp) {
        this.comp = comp;
    }

    public boolean isObrgComp() {
        return obrgComp;
    }

    public void setObrgComp(boolean obrgComp) {
        this.obrgComp = obrgComp;
    }
    
    
    
    
    
    
}
