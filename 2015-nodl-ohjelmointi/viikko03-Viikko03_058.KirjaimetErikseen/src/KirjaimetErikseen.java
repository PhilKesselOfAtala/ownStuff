
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Nimi: ");
        String nimi = lukija.nextLine(); 
        
        int count = 1;
        /*for (int i = 0; i < nimi.length(); i++) {
            System.out.println(count + ". kirjain: " + nimi.charAt(i));
            count++;
        }*/
        
        int i = 0;
        
        while (true) {
            
            if (i < nimi.length()) {
                System.out.println(count + ". kirjain: " + nimi.charAt(i));
                count++;
                i++;
            } else {
                break;
            }            
        }
    }
}
