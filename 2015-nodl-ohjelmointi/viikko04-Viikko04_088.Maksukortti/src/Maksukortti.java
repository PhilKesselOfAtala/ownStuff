/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Maksukortti {

    private double alkusaldo = 0;
    private final int saldoraja = 150;
    
    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän        
        if (alkusaldo > saldoraja) {
            this.alkusaldo = saldoraja;
        } else {
            this.alkusaldo = alkusaldo;
        }
    }
    
    public void syoEdullisesti() {
        // kirjoita koodia tähän
        if (alkusaldo >= 2.50) {
            alkusaldo = alkusaldo - 2.50;
        }
    }

    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if (alkusaldo >= 4.30) {
            alkusaldo = alkusaldo - 4.30;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
    // kirjoita koodia tähän
        double a = alkusaldo + rahamaara;
        
        if (a <= saldoraja && rahamaara >= -1) {
            alkusaldo = alkusaldo + rahamaara;
        } else if (a >= saldoraja) {
            alkusaldo = saldoraja;
        }
    }

    //@Override
    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla on rahaa " + alkusaldo + " euroa";
    }
}
