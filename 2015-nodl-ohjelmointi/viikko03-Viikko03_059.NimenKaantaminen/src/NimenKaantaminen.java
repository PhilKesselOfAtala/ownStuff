import java.util.Scanner;

public class NimenKaantaminen {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tee koodisi tänne
        System.out.println("Nimi: ");
        String nimi = lukija.nextLine(); 
 
       /* System.out.print("Väärinpäin: ");
        
        for (int i = nimi.length() - 1; i < nimi.length(); i--) {
            System.out.print(nimi.charAt(i));
            if (i <= 0) {
                break;
            }
        }*/
        
        System.out.print("Väärinpäin: ");
        int i = nimi.length();
        
        while (true) {
            i--;
            if (i < nimi.length()) {
                System.out.print(nimi.charAt(i));
            }
            
            if (i <= 0) {
                System.out.println();
                break;
            }
        }        
    }
}
