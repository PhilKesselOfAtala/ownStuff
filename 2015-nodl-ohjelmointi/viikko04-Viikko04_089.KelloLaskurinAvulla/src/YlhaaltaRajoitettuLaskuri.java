/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private final int ylaraja;

    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        // kirjoita koodia tähän
        this.ylaraja = ylarajanAlkuarvo;
    }

    public void seuraava() {
        // kirjoita koodia tähän
        if (arvo < ylaraja) {
            arvo++;
        } else if (arvo >= ylaraja) {
            arvo = 0;
        }
    }
    
    public void asetaArvo(int value) {
        if (value <= ylaraja && value > -1) {
            arvo = value;
        }
    }
    
    public boolean isZero() {
        if (arvo == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        // kirjoita koodia tähän
        if (arvo <= 9) {
            return "0" + arvo;
        } else {
            return "" + arvo;
        }
    }
    
    public int arvo() {
        return arvo;
    }
}
