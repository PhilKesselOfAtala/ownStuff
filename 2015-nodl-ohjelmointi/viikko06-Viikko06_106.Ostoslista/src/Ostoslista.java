
import com.sun.org.apache.xml.internal.serializer.ToStream;
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class Ostoslista {
    private ArrayList<String> lista;
    
    public Ostoslista() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(String tuote) {
        this.lista.add(tuote);                
    }
    
    public boolean onkoListalla(String tuote) {
        return this.lista.contains(tuote);
    }
    
    public int kappalemaara(String tuote) {
        int lukema = 0;
        
        for(String a : lista) {
            if(a.equals(tuote)) {
                lukema++;
            }
        }
        return lukema;        
    }
    
    public void poista(String tuote) {
        this.lista.remove(tuote);
    }
    
    @Override
    public String toString() {
        String printti = "Ostetaan seuraavat tuotteet \n";
        Collections.sort(lista);
        
        for(String temp : this.lista) {
            if(!printti.contains(temp)) {
                printti += temp + " " + kappalemaara(temp) + " kpl. \n";
            }  
        }
        return printti;
    }
}
