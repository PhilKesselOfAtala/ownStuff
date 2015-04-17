import java.util.Scanner;

public class EnsimmainenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Nimi: ");
        String nimi = lukija.nextLine();
        
        System.out.println("Ensimmäinen kirjain: " + ensimmainenKirjain(nimi));
    }
    
    public static char ensimmainenKirjain(String merkkijono) {
        char a = merkkijono.charAt(0);
        return a;
    }
}
