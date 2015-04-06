
import java.util.Scanner;

public class Lampotiloja {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        while (true)        {
            System.out.println("Anna liukuluku: ");
            double luku = Double.parseDouble(lukija.nextLine());
            if (luku >= 40 || luku <= -30) {
                System.out.println("Ei lisätä");
            } else { 
                Kuvaaja.lisaaNumero(luku);
            }        
        }
    }
}
