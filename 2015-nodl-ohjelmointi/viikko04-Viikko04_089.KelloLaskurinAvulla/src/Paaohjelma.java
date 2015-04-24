
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne koodia jolla testaat että YlhaaltaRajoitettuLaskuri toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävissä 89.3 ja 89.4 ja käyttää tehtäväannossa
        // ehdotettua koodirunkoa
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);
        
        System.out.print("sekunnit: ");
        int sek = Integer.parseInt(lukija.nextLine()); // kysy sekuntien alkuarvo käyttäjältä
        System.out.print("minuutit: ");
        int min = Integer.parseInt(lukija.nextLine()); // kysy minuuttien alkuarvo käyttäjältä
        System.out.print("tunnit: ");
        int tun = Integer.parseInt(lukija.nextLine()); // kysy tuntien alkuarvo käyttäjältä

        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);

        System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);

        int i = 0;
        int c = 0;
        
        while (i < 121) {
            // tulostetaan nykyinen aika
            while (c < 59) { // sekunnttilaskuri
                sekunnit.seuraava(); 
                
                if (sekunnit.isZero()) {
                    minuutit.seuraava(); // minuuttimäärä kasvaa

                    if (minuutit.isZero()) { // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa
                        tunnit.seuraava();
                    }
                    
                    System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);
                    break;
                }
                
                System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);
            }
            i++;
        }
    }    
}

