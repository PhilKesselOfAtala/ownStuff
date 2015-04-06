
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Ohjain.kaynnista();
        
        //Ohjain.asetaLaatikkoSatunnaisesti();

        int lukema = 0;

        int robottiX = Ohjain.robottiX();
        int robottiY = Ohjain.robottiY();
        int laatikkoX = Ohjain.laatikkoX();
        int laatikkoY = Ohjain.laatikkoY();
        int tavoiteX = Ohjain.tavoiteX();
        int tavoiteY = Ohjain.tavoiteY();

        // toteuta ohjelma tänne
        while (true){
            System.out.println("komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("oikea")) {
                Ohjain.oikea();
            } else if (komento.equals("vasen")) {
                Ohjain.vasen();    
            } else if (komento.equals("liiku")) {
                Ohjain.liiku();
            } else if (komento.equals("sammuta")) {
                Ohjain.sammuta();
            } else if (komento.equals("liiku monta")) {
                System.out.println("kuinka paljon? ");
                lukema = Integer.parseInt(lukija.nextLine());
                Ohjain.liikuMonta(lukema);
            } else if (komento.equals("viereen")) {
                robottiX = tavoiteX-robottiX;
                robottiY = tavoiteY-laatikkoY;
                tavoiteX = robottiX+tavoiteX-1;
                tavoiteY = robottiY-tavoiteY;
                Ohjain.liikuMonta(tavoiteX);
                Ohjain.vasen();
                Ohjain.liikuMonta(tavoiteY);
            }
        }
    }
}
