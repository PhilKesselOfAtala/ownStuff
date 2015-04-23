public class VahenevaLaskuri {
    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private final int alkuArvo;

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.alkuArvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
        if (arvo > 0) {
            arvo--;
        }
    }
     // ja tänne muut metodit   
    public void nollaa() {
        arvo = 0;
    }
    
    public void palautaAlkuarvo() {
        arvo = alkuArvo;
    }
}
