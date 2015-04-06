
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int syotto1 = Integer.parseInt(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int syotto2 = Integer.parseInt(lukija.nextLine());
        while (true) {
            if (syotto2 <= syotto1) {
                System.out.println(syotto2);
                syotto2 += 1;             
            } else {
                break;
            }
        }          
    }
}
