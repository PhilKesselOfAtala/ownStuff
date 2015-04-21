
import java.util.ArrayList;
import java.util.Collections;

public class Yhdistelya {

    public static void main(String[] args) {

        //Alustetaan listat
        //Allaolevia lukuja saa muuttaa testatessa
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        Collections.addAll(lista1, 4, 3);
        // addAll tekee saman kuin komennot:
        // lista1.add(4);
        // lista1.add(3);

        Collections.addAll(lista2, 5, 10, 7);
        // addAll tekee saman kuin komennot:
        // lista2.add(5);
        // lista2.add(10);
        // lista2.add(7);

        //Toteuta metodi yhdista ja testaa sen toimintaa eri listoilla
        yhdista(lista1, lista2);
        System.out.println(lista1);
        System.out.println(lista2);

        // Toteuta tämän jälkeen metodi joukkoYhdista ja testaa sen toimintaa
        // eri listoilla
        joukkoYhdista(lista1, lista2);
        System.out.println(lista1);
        System.out.println(lista2);
    }
    
    public static void yhdista(ArrayList<Integer> luvut1, ArrayList<Integer> luvut2) {
        luvut1.addAll(luvut2);
        /*for (int i = 0; i < luvut2.size(); i++) {
            luvut1.add(luvut2.get(i));
        }*/
    }
    
    public static void joukkoYhdista(ArrayList<Integer> eka, ArrayList<Integer> toka) {
        for (int i = 0; i < toka.size(); i++) {
            if (!eka.contains(toka.get(i))) {
                eka.add(toka.get(i));
            }
        }        
    }
}
