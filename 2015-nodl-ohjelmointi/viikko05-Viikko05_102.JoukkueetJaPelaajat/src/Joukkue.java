
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Joukkue {
    private String nimi;
    private int maxKoko;
    private ArrayList<Pelaaja> pelaajat;
    
    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.maxKoko = 16;
        this.pelaajat = new ArrayList<>();
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public void lisaaPelaaja(Pelaaja pelaaja) {
        if(this.koko() < this.maxKoko) {
            pelaajat.add(pelaaja);
        }
    }
    
    public void tulostaPelaajat() {
        for(Pelaaja p : pelaajat) {
            System.out.println(p.toString());
        }
    }
    
    public void asetaMaksimikoko(int maksimikoko) {
        if(maksimikoko < this.maxKoko) {
            this.maxKoko = maksimikoko;
        }
    }
    
    public int koko() {
        return pelaajat.size();
    }
    
    public int maalit() {
        int temp = 0;
        
        for(Pelaaja a : pelaajat) {
            temp += a.maalit();
        }
        
        return temp;
    }
}
