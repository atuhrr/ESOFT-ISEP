/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import pt.ipp.isep.dei.esoft.pot.model.*;

import java.util.List;

public class DefinirCategoriaController {

    private Plataforma m_oPlataforma;
    private CategoriaTarefa categoriaTarefa;

    public List<AreaAtividade> getListaAreaAtividade() {
        return this.m_oPlataforma.getListaAreaAtividade();
    }

    public CategoriaTarefa novaCategoriaTarefa(String desc, String IDArea) {
        return new CategoriaTarefa(desc, m_oPlataforma.getAreaAtividadeById(IDArea));
    }

    public List<CompetenciaTecnica> getListaCompetenciaTecnica() {
        return this.m_oPlataforma.getListaCompetenciaTecnica();
    }

    public CompetenciaTecnica novaCompetenciaTecnica(String idComp,boolean obrgComp) {
        return m_oPlataforma.getCompetenciaById(idComp);
    }
    public boolean registaCategoria(CategoriaTarefa categoriaTarefa) {
        return this.m_oPlataforma.registaCategoria(categoriaTarefa);
    }
    
    
    
    
    
}
