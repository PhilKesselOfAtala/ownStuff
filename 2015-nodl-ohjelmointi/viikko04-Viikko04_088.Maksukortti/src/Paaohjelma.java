
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        // tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän osassa 88.6!
        Maksukortti pekkaKortti = new Maksukortti(20);
        Maksukortti mattiKortti = new Maksukortti(30);

        pekkaKortti.syoMaukkaasti();
        mattiKortti.syoEdullisesti();
        
        System.out.println("Pekka: " + pekkaKortti);
        System.out.println("Matti: " + mattiKortti);
    
        pekkaKortti.lataaRahaa(20);
        
        mattiKortti.syoMaukkaasti();
        
        System.out.println("Pekka: " + pekkaKortti);
        System.out.println("Matti: " + mattiKortti);
        
        pekkaKortti.syoEdullisesti();
        pekkaKortti.syoEdullisesti();
        
        mattiKortti.lataaRahaa(50);
        
        System.out.println("Pekka: " + pekkaKortti);
        System.out.println("Matti: " + mattiKortti);
    }
}
