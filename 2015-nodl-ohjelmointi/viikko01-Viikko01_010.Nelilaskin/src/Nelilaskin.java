import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        int eka = 5;
        int toka = 3;
        double jakotulos = (double)eka / (double)toka;
        System.out.println(eka + " + " + toka + " = " + (eka + toka));

        // Toteuta loput nelilaskimesta tähän.
        System.out.println(eka + " - " + toka + " = " + (eka - toka));
        System.out.println(eka + " * " + toka + " = " + (eka * toka));
        System.out.println(eka + " / " + toka + " = " + jakotulos);
        
        Scanner lukija = new Scanner(System.in);
    }
}
