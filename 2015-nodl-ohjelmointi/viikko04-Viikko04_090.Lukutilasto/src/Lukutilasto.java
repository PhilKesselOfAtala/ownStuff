
import java.util.ArrayList;


public class Lukutilasto {
    private int lukujenMaara;
    private int summa;
    //private double ka;
    
    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        lukujenMaara = 0;
        summa = 0;
        //ka = (double) summa / (double) lukujenMaara;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        lukujenMaara++;
        summa += luku;
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return lukujenMaara;
    }
    
    public int summa() {
        // kirjoita koodia tähän        
        return summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän
        return (double) summa / (double) lukujenMaara;
    }   
}