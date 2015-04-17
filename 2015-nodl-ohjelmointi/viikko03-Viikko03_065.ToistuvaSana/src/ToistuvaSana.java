
import java.util.ArrayList;
import java.util.Scanner;

public class ToistuvaSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne edellisen tehtävän tapaan ArrayList johon laitat sanat
        ArrayList<String> sanat = new ArrayList<>();
        
        System.out.println("Anna sana: ");
        String input = lukija.nextLine();
        
        for (int i = 0; !sanat.contains(input); i++) {
            sanat.add(input);
            System.out.print("Anna sana: ");
            input = lukija.nextLine();
        }  
        
        System.out.println("Annoit uudestaan sanan " + input);
    }
}
