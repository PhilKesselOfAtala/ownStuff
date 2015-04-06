
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();

        // ohjelmoi liikkeet tänne
        for (int a = 0; a <= 4; a++) {
            Ohjain.ylos();
        }
        
        for (int a = 0; a <= 6; a++) {
            Ohjain.oikealle();
        }
        
        for (int a = 0; a <= 4; a++) {
            Ohjain.alas();
        }          

        for (int a = 0; a <= 6; a++) {
            Ohjain.vasemmalle();
        }
        
        for (int a = 0; a <= 2; a++) {
            Ohjain.ylos();
        }        

        for (int a = 0; a <= 2; a++) {
            Ohjain.oikealle();
        }
        for (int a = 0; a <= 1; a++) {
            Ohjain.ylos();
        }
        for (int a = 0; a <= 2; a++) {
            Ohjain.vasemmalle();
        }          
        Ohjain.sammuta();
    }
}
