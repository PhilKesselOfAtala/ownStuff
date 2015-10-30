/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Lukutulostin {
    
    public Lukutulostin() {
        
    }
    
    public void lukuporras(int luku) {
        int rivinumero = 1;

        while (rivinumero <= luku) {
            int a = 1;
            while (a <= rivinumero) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
            rivinumero++;
        }        
    }
    
    public void rajattuLukuporras(int alku, int loppu) {        
        int rivinumero = 1;

        while (rivinumero <= loppu) {
            int a = 1;
            if(rivinumero >= alku) {
                while (a <= rivinumero) {
                    System.out.print(a + " ");
                    a++;
                }
                System.out.println();
            }
            rivinumero++;
        }
    }
    
    public void jatkuvaLukuporras(int luku) {
        int rivinumero = 1;
        int templuku = 1;
        
        while (rivinumero <= luku) {
            int a = 1;
            while (a <= rivinumero) {
                System.out.print(templuku + " ");
                a++;
                templuku++;
            }
            System.out.println();
            rivinumero++;
        }         
    }
    
    public void kertokolmio(int luku)  {
        int rivinumero = 1;
        
        while (rivinumero <= luku) {
            int a = 1;
            while (a <= rivinumero) {
                System.out.print(a * rivinumero + " ");
                a++;
            }
            System.out.println();
            rivinumero++;
        }         
    }
}
