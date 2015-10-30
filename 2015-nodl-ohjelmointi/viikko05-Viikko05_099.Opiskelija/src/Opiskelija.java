/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Opiskelija {
    private String nimi;
    private String opiskelijaNumero;
    
    public Opiskelija(String nimi, String opiskelijaNumero) {
        this.nimi = nimi;
        this.opiskelijaNumero = opiskelijaNumero;
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public String haeOpiskelijanumero() {
        return this.opiskelijaNumero;
    }
    
    @Override
    public String toString() {
        return this.haeNimi() + " (" + this.opiskelijaNumero + ")";
    }
}
