
import java.util.ArrayList;
import java.util.Random;

public class LottoRivi {

    private ArrayList<Integer> numerot;
    private Random random;

    public LottoRivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.random = new Random();

        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
        int i = 0;
        
        while (i != 7) {
            int luku = this.random.nextInt(40);
            int arvottu = luku;
                        
            if(!sisaltaaNumeron(arvottu) && arvottu != 0) {
                this.numerot.add(arvottu);
                i++;
            } 
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return numerot().contains(numero);
    }
}
