/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.ui.console;


import pt.ipp.isep.dei.esoft.pot.controller.EspecificarTarefaController;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

/**
 *
 * @author paulomaio
 */
public class EspecificarTarefaUI
{
    private EspecificarTarefaController m_controller;
    public EspecificarTarefaUI()
    {
       
    }

    public void run()
    {
        System.out.println("\nEspecificar Área de Atividade:");

        if(introduzDados())
        {
            apresentaDados();

            if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
                if (m_controller.registaTarefaAtividade()) {
                    System.out.println("Registo efetuado com sucesso.");
                } else {
                    System.out.println("Não foi possivel concluir o registo com sucesso.");
                }
            }
        }
        else
        {
            System.out.println("Ocorreu um erro. Operação cancelada.");
        }
    }
    
    private boolean introduzDados() {
        String strCodigo = Utils.readLineFromConsole("Código: ");
        String strDescricaoBreve = Utils.readLineFromConsole("Descrição Breve: ");
        String strDescricaoDetalhada = Utils.readLineFromConsole("Descrição Detalhada: ");
        
        return m_controller.novaTarefa(strCodigo, strDescricaoBreve,strDescricaoDetalhada);
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nÁrea de Atividade:\n" + m_controller.getEspecificarTarefaString());
    }
}
