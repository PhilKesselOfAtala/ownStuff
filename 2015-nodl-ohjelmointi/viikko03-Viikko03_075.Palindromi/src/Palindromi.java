import java.util.Scanner;

public class Palindromi {

    public static boolean palindromi(String merkkijono) {
        // kirjoita koodia tähän
        
        int i = merkkijono.length();
        String temp = "";
        
        if (i != 0) {
            while (true) {
                i--;
                if (i < merkkijono.length()) {
                    temp += merkkijono.charAt(i);
                }

                if (i <= 0) {
                    System.out.println();
                    break;
                }
            }
        }
        
        if (temp.equals(merkkijono)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();    
        if (palindromi(merkkijono)) {
            System.out.println("Merkkijono on palindromi!");
        } else {
            System.out.println("Merkkijono ei ole palindromi!");
        }
    }
}
