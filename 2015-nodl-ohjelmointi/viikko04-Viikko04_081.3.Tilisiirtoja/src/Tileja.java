
public class Tileja {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili aTili = new Tili("a-Tili", 100.0);
        Tili bTili = new Tili("b-Tili", 0.0);
        Tili cTili = new Tili("c-Tili", 0.0);
        
        tilisiirto(aTili, bTili, 50.0);
        tilisiirto(bTili, cTili, 25.0);
    }
    
    public static void tilisiirto(Tili mista, Tili minne, double paljonko) {
        mista.otto(paljonko);
        minne.pano(paljonko);
    }


}
