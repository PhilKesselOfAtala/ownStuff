
public class Tileja {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili aTili = new Tili("Matin tili", 1000);
        Tili bTili = new Tili("Oma tili", 0);
        
        aTili.otto(100);
        bTili.pano(100);
        
        System.out.println(aTili);
        System.out.println(bTili);
    }
}
