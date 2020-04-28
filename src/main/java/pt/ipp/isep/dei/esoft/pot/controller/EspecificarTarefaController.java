package pt.ipp.isep.dei.esoft.pot.controller;


import java.util.*;

import pt.ipp.isep.dei.esoft.pot.model.Colaborador;

/**
 * 
 */
public class EspecificarTarefaController extends Colaborador {
	 private String referencia;
	 private String designacao;
	 private String descricaoInformal;
	 private String descricaoTecnica;
	 private String duracao;
	 private double custo;
	 private String categoria;

	
	
    /**
     * Default constructor
     */
    public EspecificarTarefaController(String strNome, String strFuncao, String strTelefone, String strEmail,
			String referencia, String designacao, String descricaoInformal, String descricaoTecnica, String duracao,
			double custo, String categoria) {
		super(strNome, strFuncao, strTelefone, strEmail);
		this.referencia = referencia;
		this.designacao = designacao;
		this.descricaoInformal = descricaoInformal;
		this.descricaoTecnica = descricaoTecnica;
		this.duracao = duracao;
		this.custo = custo;
		this.categoria = categoria;
	}

	/**
     * @param referencia 
     * @param designacao 
     * @param descricaoInformal 
     * @param descricaoTecnica 
     * @param duracao 
     * @param custo 
     * @param categoria
     */
    public void novaTarefa(String referencia, String designacao, String descricaoInformal, String descricaoTecnica, String duracao, double custo, String categoria) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean EspecificarTarefa() {
        // TODO implement here
        return false;
    }

	public boolean registaTarefaAtividade() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean novaTarefa(String strCodigo, String strDescricaoBreve, String strDescricaoDetalhada) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getEspecificarTarefaString() {
		// TODO Auto-generated method stub
		return null;
	}

}