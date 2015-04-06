
import java.util.Scanner;
import robotti.Ohjain;

public class Portaikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Montako ylös? ");
        int ylossyotto = Integer.parseInt(lukija.nextLine());
        System.out.print("Montako alas? ");
        int alassyotto = Integer.parseInt(lukija.nextLine());
        int ylos = 0;
        int alas = 0;
        while (true) {
            if (ylossyotto > ylos) {
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liiku();
                ylos += 1;
            } else {
                break;
            }
        }
        while (true) {
            if (alassyotto > alas) {
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.vasen();
                Ohjain.liiku();
                alas += 1;
            } else {
                break;
            }
        }        
        Ohjain.sammuta();
    }
}
