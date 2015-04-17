import java.util.ArrayList;
import java.util.Scanner;

public class Sanat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
        
        System.out.print("Anna sana: ");
        String input = lukija.nextLine();
        
        for (int i = 0; !input.isEmpty(); i++) {
            sanat.add(input);
            System.out.print("Anna sana: ");
            input = lukija.nextLine();
        }
   
        System.out.println("Annoit seuraavat sanat: ");
        
        for (String content : sanat) {
            System.out.println(content);
        }
    }
}
