
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-60]: ");
        int pisteet = Integer.parseInt(lukija.nextLine());
       
        if (pisteet <= 29) {
            System.out.println("Arvosana: Hylätty");        
        } else if (pisteet >= 50) {
            System.out.println("Arvosana: 5");
        } else if (pisteet >= 45) {
            System.out.println("Arvosana: 4");
        } else if (pisteet >= 40) {
            System.out.println("Arvosana: 3");
        } else if (pisteet >= 35) {
            System.out.println("Arvosana: 2");
        } else if (pisteet >= 30) {
            System.out.println("Arvosana: 1");
        }        


       


  
    }
}
