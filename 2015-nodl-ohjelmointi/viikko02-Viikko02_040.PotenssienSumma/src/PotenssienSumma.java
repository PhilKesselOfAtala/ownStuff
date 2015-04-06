
import java.util.Scanner;

public class PotenssienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
             
        System.out.print("Anna luku? ");
        int eksponentti = Integer.parseInt(lukija.nextLine());
        int potenssitulos = 0;    
        int summa = 0;
        int i = 0;

        while (i <= eksponentti) {
            potenssitulos = (int) Math.pow(2, i); 
            summa = summa + potenssitulos;
            i++;
        }
        System.out.println("Tulos on " + summa);
    }
}
