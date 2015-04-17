
import java.util.Scanner;

public class ViimeinenKirjain {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Nimi: ");
        String nimi = lukija.nextLine();
        
        System.out.println("Viimeinen kirjain: " + viimeinenKirjain(nimi));
    }
    
    public static char viimeinenKirjain(String merkkijono) {      
        char a = merkkijono.charAt(merkkijono.length() - 1);
        return a;
    }
}
