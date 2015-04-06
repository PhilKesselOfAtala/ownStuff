import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 1;
        int i = 0;
        
        System.out.print("Anna luku? ");
        int syotto = Integer.parseInt(lukija.nextLine());
                
        while (i < syotto) {
            i++;
            tulos = tulos * i;
        }
        System.out.println("Kertoma on " + tulos);
    }
}
