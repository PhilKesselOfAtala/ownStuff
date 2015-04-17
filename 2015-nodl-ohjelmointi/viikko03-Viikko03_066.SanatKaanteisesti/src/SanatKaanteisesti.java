import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanatKaanteisesti {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tee tänne edellisen tehtävän tapaan ArrayList, johon laitat sanat
        ArrayList<String> sanat = new ArrayList<>();
        
        System.out.print("Anna sana: ");
        String input = lukija.nextLine();
        
        for (int i = 0; !input.isEmpty(); i++) {
            sanat.add(input);
            System.out.print("Anna sana: ");
            input = lukija.nextLine();
        }  
        
        System.out.println("Annoit seuraavat sanat:");
        Collections.reverse(sanat);
        
        for (String sanat1 : sanat) {
            System.out.println(sanat1);
        } 
    }
}
