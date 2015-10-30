/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Sanatulostin {
    private String nimi;

    public Sanatulostin(String nimi) {
        this.nimi = nimi;
    }
    
    public void sanaporras(int luku) {
        int rivinumero = 1;
        int templuku = 0;

        while (rivinumero <= luku) {
            int a = 1;
            while (a <= rivinumero) {
                System.out.print(this.nimi.charAt(templuku));
                a++;
                templuku++;
                
                if(this.nimi.length() <= templuku) {
                    templuku = 0;
                }
            }
            System.out.println();
            rivinumero++;
        }        
    }
    
    public void laskevaSanaporras(int luku) {
        int rivinumero = 1;
        int kirjain = 0;
        int temprivi = luku;
        
        while (rivinumero <= luku) {
            int a = 1;
            while (a <= temprivi) {
                System.out.print(this.nimi.charAt(kirjain));
                a++;
                kirjain++;
                
                if(this.nimi.length() <= kirjain) {
                    kirjain = 0;
                }
            }
            System.out.println();
            rivinumero++;
            temprivi--;
        }
    }
    
    public void sanapyramidi(int luku) {
        int rivinumero = 1;
        int kirjain = 0;
        int temprivi = luku;
        
        while (rivinumero <= luku) {
            int a = 1;
            while (a <= rivinumero) {
                System.out.print(this.nimi.charAt(kirjain));
                a++;
                kirjain++;
                
                if(this.nimi.length() <= kirjain) {
                    kirjain = 0;
                }
            }
            System.out.println();
            rivinumero++;
        }
        
        rivinumero = 1;
        temprivi = luku;
        
        while (rivinumero <= luku) {
            int a = 1;
            while (a < temprivi) {
                System.out.print(this.nimi.charAt(kirjain));
                a++;
                kirjain++;
                
                if(this.nimi.length() <= kirjain) {
                    kirjain = 0;
                }
            }
            System.out.println();
            rivinumero++;
            temprivi--;
        }        
    }
}
