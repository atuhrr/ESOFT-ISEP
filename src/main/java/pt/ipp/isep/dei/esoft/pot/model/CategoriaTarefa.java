
package pt.ipp.isep.dei.esoft.pot.model;

public class CategoriaTarefa {
    private String desc;
    private AreaAtividade area;
    private boolean obrgComp;
    private ObrigatoriedadeCT obrgCT ;

    public CategoriaTarefa(String desc, AreaAtividade area) {
       try{
           this.desc = desc;
           this.area = area;
       }
        catch (Exception e){
            throw e;
        }
    }

    public String getDescricao() {
        return desc;
    }

    public void setDescricao(String desc) {
        this.desc = desc;
    }

    public AreaAtividade getAreaAtividade() {
        return area;
    }

    public void setAreaAtividade(AreaAtividade area) {
        this.area = area;
    }

    public boolean isObrigatoriedade() {
        return obrgComp;
    }

    public void setObrigatoriedade(boolean obrgComp) {
        this.obrgComp = obrgComp;
    }

    public ObrigatoriedadeCT getObrigatoriedadeCT() {
        return obrgCT ;
    }

    public void setCompetencia(ObrigatoriedadeCT obrgCT ) {
        this.obrgCT  = obrgCT ;
    }
    
    
    
    public void addObrigatoriedadeCompetencia (boolean obrigatoriedade){
        
        this.obrgComp=obrigatoriedade;
    }
  
    public void setObrigatoriedadeCT(ObrigatoriedadeCT obrgCT ){
       this.obrgCT=obrgCT; 
    }
    
   public void addObrigatoriedadeCT(ObrigatoriedadeCT obrgCT){
       this.obrgCT=obrgCT;
       this.obrgComp=obrgCT.isObrgComp();
   }


    
}
