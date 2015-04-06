
import java.util.Scanner;

public class IkienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä on nimi?\n");
        String nimi = lukija.nextLine();
        // Toteuta ohjelmasi tähän.
        System.out.println("Mikä on ikä?\n");
        int ika = Integer.parseInt(lukija.nextLine());
        System.out.println("Mikä on nimi?\n");
        String nimi2 = lukija.nextLine();    
        System.out.println("Mikä on ikä?\n");
        int ika2 = Integer.parseInt(lukija.nextLine());
        
        int summa = ika + ika2;

        
        System.out.println(nimi + " ja " + nimi2 + " ovat yhteensä " + summa + " vuotta vanhoja");
    }
}
