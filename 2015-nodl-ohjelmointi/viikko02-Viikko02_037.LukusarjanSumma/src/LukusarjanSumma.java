
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;
        int i = 0;
        
        System.out.print("Mihin asti? ");
        int syotto = Integer.parseInt(lukija.nextLine());
                
        while (i <= syotto) {
            tulos += i;
            i++;     
        }
        System.out.println("Summa on " + tulos);
    }
}
