/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Kertoja {
    private int lukuKertoja = 0;
    
    public Kertoja(int luku) {
        this.lukuKertoja = luku;
    }
    
    public int kerro(int toinenLuku) {
        toinenLuku = lukuKertoja * toinenLuku;
        return toinenLuku;
    }
}
