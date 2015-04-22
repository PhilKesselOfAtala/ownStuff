
import java.util.ArrayList;
import java.util.Scanner;

public class Vieraslista {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa -- nyt tai muutenkaan :)
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        // kun toteutat metodit, voit testata toimintaa täällä
        lueNimet(lukija, lista);
        System.out.println("");
        tarkistaNimet(lukija, lista);
        System.out.println("Kiitos!");
    }
    
    public static void lueNimet(Scanner lukija, ArrayList<String> lista) {
        System.out.println("Syötä nimiä vieraslistalle, tyhjä rivi lopettaa.");
        String nimi = lukija.nextLine();
        
        /*for (int i = 0; !nimi.isEmpty(); i++) {
            lista.add(nimi);
            nimi = lukija.nextLine();
        }*/
        
        while (!nimi.isEmpty()) {
            lista.add(nimi);
            nimi = lukija.nextLine();            
        }
    }
    
    public static void tarkistaNimet(Scanner lukija, ArrayList<String> lista) {
        System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");        
        String nimi = lukija.nextLine();  
        
        /*for (int i = 0; !nimi.isEmpty(); i++) { 
            if (lista.contains(nimi)) {
                System.out.println("Nimi on listalla.");
            } else {
                System.out.println("Nimi ei ole listalla.");
            }
            nimi = lukija.nextLine();       
        }*/
        
        while (!nimi.isEmpty()) {
            if (lista.contains(nimi)) {
                System.out.println("Nimi on listalla.");
            } else {
                System.out.println("Nimi ei ole listalla.");
            }
            nimi = lukija.nextLine();               
        }
    }
}
