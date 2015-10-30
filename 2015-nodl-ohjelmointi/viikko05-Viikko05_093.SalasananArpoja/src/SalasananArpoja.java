import java.util.Random;

public class SalasananArpoja {
    // Määrittele muuttuja tässä
    private Random random;
    private int salasananPituus;

    public SalasananArpoja(int salasananPituus) {
        // Alusta muuttujat tässä
        this.random = new Random();
        this.salasananPituus = salasananPituus;
    }

    public String luoSalasana() {
        // Kirjoita tähän koodi, joka palauttaa uuden salasanan
        String uusiSalasana = "";
        char merkki = 0;
        
        int i = 0;
        
        while (i < salasananPituus) {
            int luku = random.nextInt(21);
            merkki = "abcdefghijklmnopqrstuvwxyz".charAt(luku);
            uusiSalasana += merkki;
            i++;
        }
        
        return uusiSalasana;
    }
}
