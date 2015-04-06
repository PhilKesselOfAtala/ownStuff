
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
        System.out.println("Anna ensimmäinen luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());
        double jako = (double) luku / (double) luku2;
        System.out.println("Jakolasku: " + luku + " / " + luku2 + " = " + jako);    
    }
}
