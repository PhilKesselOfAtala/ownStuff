
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana: ");
        String salasana = lukija.nextLine();
        
        if (tunnus.equals("elina") && salasana.equals("kissa") ||
            tunnus.equals("aleksi") && salasana.equals("tappara")) {
            System.out.println("Olet jo kirjautunut sisään");    
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
