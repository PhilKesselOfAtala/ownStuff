
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        int i = 0;
        int arvaus = 0;
        boolean vastaus = false;
        
        // OHJELMOI OHJELMASI TÄHÄN, ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA
        while (!vastaus) {
            System.out.println("Arvaa luku: ");
            arvaus = Integer.parseInt(lukija.nextLine());
            i++;
            if (arvaus == arvottuLuku) {
                System.out.println("Onneksi olkoon, oikein arvattu!");
                vastaus = true;
            } else if (arvaus <= arvottuLuku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia: " + i);
            } else if (arvaus >= arvottuLuku) {
                System.out.println("Luku on pienempi, tehtyjä arvauksia: " + i);
            }
        }
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
