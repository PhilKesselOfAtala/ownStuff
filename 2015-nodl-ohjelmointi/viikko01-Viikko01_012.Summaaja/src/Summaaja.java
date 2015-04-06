
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku?\n");
        int luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku?\n");
        int luku2 = Integer.parseInt(lukija.nextLine());
        int summa = luku + luku2;      
        System.out.println("Lukujen summa: " + summa);
    }
}
