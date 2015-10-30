
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private final double maukasLounas = 4.3;
    private final double edullinenLounas = 2.5;
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }
    
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if(summa >= 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;            
        }
    }    

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        //double hinta = 2.5;
        
        if(maksu >= edullinenLounas) {
            this.rahaa += edullinenLounas;
            maksu -= edullinenLounas;
            edulliset++;
            return maksu;
        }
        
        return maksu;
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        if(kortti.saldo() >= edullinenLounas) {
            kortti.otaRahaa(edullinenLounas);
            edulliset++;
            return true;
        }
        
        return false;
    }
    
    public double syoMaukkaasti(double maksu) {
        // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        //double hinta = 4.3;
        
        if(maksu >= maukasLounas) {
            this.rahaa += maukasLounas;
            maksu -= maukasLounas;
            maukkaat++;
            return maksu;
        }
        
        return maksu;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        if(kortti.saldo() >= maukasLounas) {
            kortti.otaRahaa(maukasLounas);
            maukkaat++;
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
