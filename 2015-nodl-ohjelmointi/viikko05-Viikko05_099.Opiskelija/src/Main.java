
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tee tänne pääohjelma
        /*Opiskelija pekka = new Opiskelija("Pekka Mikkola", "013141590");
        System.out.println("Nimi: " + pekka.haeNimi());
        System.out.println("Opiskelijanumero: " + pekka.haeOpiskelijanumero());
        System.out.println(pekka);  */  
            
        String nimi, nro = "";
        Scanner lukija = new Scanner(System.in);
        ArrayList<Opiskelija> lista = new ArrayList<>();

        while(true) {
            System.out.print("Nimi: ");
            nimi = lukija.nextLine();
            
            if(nimi.isEmpty()) {
                break;
            }
            
            System.out.print("Opiskelijanumero: ");
            nro = lukija.nextLine();
            
            if(!nimi.isEmpty()) {
                Opiskelija opiskelija = new Opiskelija(nimi, nro);
                lista.add(opiskelija);
            }
        }  

        System.out.println("Opiskelijat:");
        
        for (Opiskelija lista1 : lista) {
            System.out.println(lista1);
        }
        
        System.out.print("Anna hakusana: ");
        String hakusana = lukija.nextLine();
        
        System.out.println("Tulokset: ");
        
        for(Opiskelija lista2 : lista) {
            if(lista2.haeNimi().contains(hakusana)) {
                System.out.println(lista2);
            }  
        }
    }
}