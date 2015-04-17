
import java.util.Scanner;

public class MerkkijononKaantaminen {

    public static String kaanna(String merkkijono) {
        // Kirjoita koodia tähän.
        // Metodin on siis palautettava käännetty merkkijono returnilla!
        int i = merkkijono.length();
        String temp = "";
        
        while (true) {
            i--;
            if (i < merkkijono.length()) {
                //System.out.print(merkkijono.charAt(i));
                temp += merkkijono.charAt(i);
            }
            
            if (i <= 0) {
                System.out.println();
                break;
            }
        } 
        return temp;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Väärinpäin: " + kaanna(merkkijono));
    }
}
