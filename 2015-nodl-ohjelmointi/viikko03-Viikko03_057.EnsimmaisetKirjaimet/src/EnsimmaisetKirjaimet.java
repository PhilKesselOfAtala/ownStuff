import java.util.Scanner;

public class EnsimmaisetKirjaimet {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Nimi: ");
        String nimi = lukija.nextLine(); 
        
        if (nimi.length() >= 3) {
            int count = 1;
            for (int i = 0; i < 3; i++) {
                System.out.println(count + ". kirjain: " + nimi.charAt(i));
                count++;
            }            
        }

    }
}
