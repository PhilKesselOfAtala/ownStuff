
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double ka = 0;
        double summa = 0;
        int i = 0;
        int syotto = 0;
        // Huom! Tässä tehtävässä ei ole testejä, joten testien ajaminen
        // antaa sinulle viestin "kaikki ok!". Älä kuitenkaan luota viestiin,
        // vaan pyri tekemään ongelmaan ratkaisu askel askeleelta. 
        
        // Katso askeleittaiseen etenemiseen neuvoja materiaalissa 
        // juuri olleesta esimerkistä.
        
        
        // ohjelmoi ongelmaan ratkaisu tähän, lähde liikkeelle pienen
        // toiminnallisuuden kuten yhden luvun lukemisen toteuttamisesta
        System.out.println("Anna desibelilukuja, lopeta luvulla 9999.");
        System.out.println("Anna desibeliluku: ");
        syotto = Integer.parseInt(lukija.nextLine());
        
        while (syotto != 9999) {            
            if (syotto == 9999) {
                break;
            }
            
            if (syotto >= - 1) {
                summa = (double) syotto + summa;
                i++;             
            }
            System.out.println("Anna desibeliluku: ");
            syotto = Integer.parseInt(lukija.nextLine());            
        }
        
        if (summa <= 0) {
            System.out.println("Yhtään desibelilukua ei syötetty");
        } else {
            ka = summa / i;
            System.out.println("Desibelilukujen keskiarvo on " + ka);            
        }        
    }
}
