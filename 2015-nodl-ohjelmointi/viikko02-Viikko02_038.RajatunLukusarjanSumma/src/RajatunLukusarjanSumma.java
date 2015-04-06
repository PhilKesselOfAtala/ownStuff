
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;

        System.out.print("Ensimmäinen? ");
        int ala = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Viimeinen? ");
        int yla = Integer.parseInt(lukija.nextLine());
                
        while (ala <= yla) {
            tulos += ala;
            ala++;     
        }
        System.out.println("Summa on " + tulos);
    }
}
