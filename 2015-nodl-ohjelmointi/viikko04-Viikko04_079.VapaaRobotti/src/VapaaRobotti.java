
import java.util.Scanner;
import robotti.Ohjain;

public class VapaaRobotti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna pituus: ");
        int pituus = Integer.parseInt(lukija.nextLine());
        Ohjain.kaynnista();
        // kokeile metodejasi täällä
        piirraNelio(pituus);
        piirraKolmio(pituus);
        piirraYmpyra(100, 6);

        Ohjain.sammuta();
    }

    // ohjelmoi metodit tänne
    public static void piirraNelio(int sivunPituus) {
        Ohjain.vasen(90);
        Ohjain.liiku(sivunPituus);
        Ohjain.vasen(90);
        Ohjain.liiku(sivunPituus);
        Ohjain.vasen(90);
        Ohjain.liiku(sivunPituus);
        Ohjain.vasen(90);
        Ohjain.liiku(sivunPituus);                
    }
    
    public static void piirraKolmio(int sivunPituus) {
        Ohjain.vasen(120);
        Ohjain.liiku(sivunPituus);
        Ohjain.vasen(120);
        Ohjain.liiku(sivunPituus);
        Ohjain.vasen(120);
        Ohjain.liiku(sivunPituus);
    }
    
    public static void piirraYmpyra(int sivunPituus, int kulmia) {
        int kaannos = 360 / kulmia;

        for (int i = 0; i < kulmia; i++) {
            Ohjain.liiku(sivunPituus);
            Ohjain.vasen(kaannos);
        }
    }
}
