
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // tee tähän projektiin tehtävät 41.1-41.5
        // kyseessä on oikeastaan yksi iso tehtävä jota koko ajan laajennetaan

        // voit myös lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. jo tehdyt osat kuitenkin kirjautuvat tehdyiksi
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut:");        
        int summa = 0;
        int i = 0;
        double ka = 0;
        int parilliset = 0;
        int parittomat = 0;
        
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());            
            ka = (double) summa / (double) i;

            if (luku == -1) {               
                System.out.println("Kiitos ja näkemiin!");
                System.out.println("Summa: " + summa);
                System.out.println("Lukuja: " + i);
                System.out.println("Keskiarvo: " + ka);
                System.out.println("Parillisia: " + parilliset);
                System.out.println("Parittomia: " + parittomat);
                break;
            }
        
            if (luku % 2 == 0) {
                parilliset++;
            } else {
                parittomat++;
            }
       
            i++;
            summa = summa + luku;
        }
    }
}
