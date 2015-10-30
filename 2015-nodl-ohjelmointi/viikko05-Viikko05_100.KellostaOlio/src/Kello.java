public class Kello {
    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;
   
    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        // luodaan kello joka asetetaan parametrina annettuun aikaan
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23); 
        
        this.sekunnit.asetaArvo(sekunnitAlussa);
        this.minuutit.asetaArvo(minuutitAlussa);
        this.tunnit.asetaArvo(tunnitAlussa);
    }
    
    public void etene() {
        // kello etenee sekunnilla
        this.sekunnit.seuraava();
        
        if (sekunnit.isZero()) {
            minuutit.seuraava(); // minuuttimäärä kasvaa
            if (minuutit.isZero()) { // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa
                tunnit.seuraava();
            }
        }
    }
    
    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return this.tunnit.toString() + ":" + this.minuutit.toString() + ":" + this.sekunnit.toString();
    }
}
