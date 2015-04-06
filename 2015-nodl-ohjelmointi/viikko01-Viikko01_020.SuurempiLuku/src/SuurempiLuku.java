
import java.util.Scanner;

public class SuurempiLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        System.out.println("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(lukija.nextLine());

        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());
        
        if (luku1 > luku2) {
            luku = luku1;
            System.out.println("Suurempi luku: " + luku);            
        } else if (luku1 < luku2) {
            luku = luku2;
            System.out.println("Suurempi luku: " + luku);
        } else if (luku1 == luku2) {
            System.out.println("Luvut ovat yhtä suuret!");        
        }
    }
}
