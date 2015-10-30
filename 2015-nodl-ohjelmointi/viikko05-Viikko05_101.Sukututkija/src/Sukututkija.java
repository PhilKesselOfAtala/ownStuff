/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Sukututkija {
    
    Henkilo isa, aiti;
    
    public Sukututkija() {
    }
    
    public void kerroHenkilosta(Henkilo henkilo) {
        boolean isAiti = henkilo.getAiti() == null;
        boolean isIsa = henkilo.getIsa() == null;
        
        if(isAiti && isIsa) {
            System.out.println(henkilo.getNimi() + ", äiti tuntematon ja isä tuntematon");
            return;
        }
        
        if(henkilo.getNimi() == null) {
            System.out.print("1");
            return;  
        }

        //nullpointer?
        this.aiti = henkilo.getAiti();
        this.isa = henkilo.getIsa();
        
        if(!isAiti && !isIsa) {
            System.out.println(henkilo.getNimi() + ", äiti " + this.aiti.getNimi() + " ja isä " + this.isa.getNimi());
            return;
        }
        
        if(isAiti && isIsa) {
            System.out.println(henkilo.getNimi() + ", äiti tuntematon ja isä tuntematon");
        } else if (isAiti || isIsa) {
            if(isAiti) {
                System.out.println(henkilo.getNimi() + ", äiti tuntematon ja isä " + this.isa.getNimi());
            } else if (isIsa) {
                System.out.println(henkilo.getNimi() + ", äiti " + this.aiti.getNimi() + "ja isä tuntematon");
            }
        }           
    }
    
    public void kerroHenkilonSuvusta(Henkilo henkilo) {
        boolean isAiti = henkilo.getAiti() == null;
        boolean isIsa = henkilo.getIsa() == null;
        
        kerroHenkilosta(henkilo);
        
        if(!isAiti && !isIsa) {
            kerroHenkilonSuvusta(henkilo.getAiti());
            kerroHenkilonSuvusta(henkilo.getIsa());
        } 
    }
    
    @Override
    public String toString() {
        return "";
    }
    
}
