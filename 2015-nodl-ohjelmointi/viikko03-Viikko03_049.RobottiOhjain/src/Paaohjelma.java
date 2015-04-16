
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();

        // ohjelmoi liikkeet tänne
        for (int i = 1; i <= 7; i++) {
            Ohjain.oikealle();
        }
        
        for (int i = 1; i <= 5; i++) {
            Ohjain.ylos();
        }
        
        for (int i = 1; i <= 7; i++) {
            Ohjain.vasemmalle();
        }
        
        for (int i = 1; i <= 5; i++) {
            Ohjain.alas();
        }        
        
        for (int i = 1; i <= 3; i++) {
            Ohjain.ylos();
        }               

        for (int i = 1; i <= 3; i++) {
            Ohjain.oikealle();
        } 

        for (int i = 1; i <= 2; i++) {
            Ohjain.ylos();
        }
               
        for (int i = 1; i <= 3; i++) {
            Ohjain.vasemmalle();
        }
        
        Ohjain.sammuta();
    }

}
//Suuremman suorakulmion leveys on 7 askelta ja korkeus on 5 askelta, ja pienemmän suorakulmion leveys on 3 askelta, ja korkeus 2 askelta.

