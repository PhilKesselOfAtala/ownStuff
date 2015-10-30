/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Laskuri {
    
    private int laskuri;
    private boolean tarkistus;
    
    public Laskuri() {
        this.laskuri = 0;
        this.tarkistus = false;
    }
    
    public Laskuri(int alkuarvo, boolean tarkistus) {
        this.laskuri = alkuarvo;
        this.tarkistus = tarkistus;
    }
    
    public Laskuri(int alkuarvo) {
        this.laskuri = alkuarvo;
        this.tarkistus = false;
    }
    
    public Laskuri(boolean tarkistus) {
        this.laskuri = 0;
        
        if(tarkistus) {
            this.tarkistus = true;
        }
    }
    
    public int arvo() {
        return this.laskuri;
    }
    
    public void lisaa() {
        this.laskuri++;
    }
    
    public void lisaa(int lisays) {
        if(lisays >= -1) {
            this.laskuri += lisays;
        }
    }
    
    public void vahenna(int vahennys) {
        int temp = this.laskuri - vahennys;
        if(vahennys <= -1) {
            return;
        }
        
        if(temp <= -1 && this.tarkistus) {
            this.laskuri = 0;
            return;
        }
        
        this.laskuri -= vahennys;
    }
    
    public void vahenna() {  
        if(this.laskuri <= 0 && this.tarkistus) {
            return;
        }
        
        this.laskuri--;
    }
    
}
