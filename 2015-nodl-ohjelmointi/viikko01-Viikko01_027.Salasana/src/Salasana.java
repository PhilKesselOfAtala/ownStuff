
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        // Toteuta ohjelmasi tähän.

        
        while (true) {
            System.out.println("Anna salasana: ");
            String kysytty = lukija.nextLine();
                        
            if (kysytty.equals(salasana)) {
                System.out.println("Oikein!");
                break;
            }
                    
            System.out.println("Väärin!");
        }
        
        System.out.println("Salaisuus on: znvavbfgv grugl!");
    }
}
