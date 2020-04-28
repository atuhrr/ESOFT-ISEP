package pt.ipp.isep.dei.esoft.pot.ui.console;

import java.util.List;
import pt.ipp.isep.dei.esoft.pot.controller.EspecificarCompetenciaTecnicaController;
import pt.ipp.isep.dei.esoft.pot.model.AreaAtividade;
import pt.ipp.isep.dei.esoft.pot.ui.console.utils.Utils;

public class EspecificarCompetenciaTecnicaUI {

    private EspecificarCompetenciaTecnicaController m_controller;

    public EspecificarCompetenciaTecnicaUI() {
        m_controller = new EspecificarCompetenciaTecnicaController();
    }

    public void run() {
        System.out.println("\nEspecificar Competência Técnica:");

        String areaEscolhidaID = listarEscolherAreaAtividadeId();                                                              
        if (areaEscolhidaID != null) {
            AreaAtividade area = m_controller.areaAtividadeByID(areaEscolhidaID);                                               
            System.out.printf("Deseja associar uma competência a %s", area.toString());
            if (validacao() && m_controller.validaAreaAtividade(area)) {                                                        
                if (introduzDados(area)) {                                                                                  
                    apresentaDados();                                                                                       
                    
                    if (Utils.confirma("Confirma os dados introduzidos? (Sim/Nao)")) {                                             
                        if (m_controller.registaCompetenciaTecnica()) {                                                     
                            System.out.println("Registo efetuado com sucesso.");
                        } else {
                            System.out.println("Não foi possivel concluir o registo com sucesso.");
                        }
                    }
                }
            } else {
                System.out.println("Não foi possivel concluir o registo com sucesso.");
            }
        } else {
            System.out.println("Não foi possível encontrar a Área de Atividade. Operação cancelada.");
        }
    }

    private String listarEscolherAreaAtividadeId() {
        List<AreaAtividade> la = m_controller.getAreasAtividade();

        AreaAtividade area = (AreaAtividade) Utils.apresentaESeleciona(la, "Selecione a Área de Atividade a que é referente esta Competência Técnica:");
        if (area != null) {
            return area.getCodigo();
        }
        return null;
    }

    private boolean introduzDados(AreaAtividade area) {

        String strId = Utils.readLineFromConsole("Id: ");
        String strDescricaoBreve = Utils.readLineFromConsole("Descrição Breve: ");
        String strDescricaoDetalhada = Utils.readLineFromConsole("Descrição Detalhada: ");

        return m_controller.novaCompetenciaTecnica(strId, strDescricaoBreve, strDescricaoDetalhada, area);
    }

    private boolean validacao() {
        String resposta = Utils.readLineFromConsole("Valida estes dados ? (Sim/Nao)");
        if (resposta.equals("Sim")) {
            return true;
        }
        return false;
    }

    private void apresentaDados() {
        System.out.println("\nCompetencia Tecnica:\n" + m_controller.getCompetenciaTecnicaString());
    }

}
