
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.println("Nimi: ");
        String summa = lukija.nextLine();
        
        System.out.println("Summa: " + laskeKirjaimet(summa));

    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono) {
        return merkkijono.length();
    }
    
}
