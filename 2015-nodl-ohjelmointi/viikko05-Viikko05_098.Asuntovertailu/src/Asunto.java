
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        return verrattava.nelioita < this.nelioita;
    }
    
    public int hintaero(Asunto verrattava) {
        int erotus = 0;
        
        int tempA = verrattava.neliohinta * verrattava.nelioita;
        int tempB = this.neliohinta * this.nelioita;
        
        if(tempA > tempB) {
            erotus = tempA - tempB;
        } else {
            erotus = tempB - tempA;
        }
        
        return erotus;
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        return (this.neliohinta * this.nelioita) > (verrattava.neliohinta * verrattava.nelioita);
    }

}
