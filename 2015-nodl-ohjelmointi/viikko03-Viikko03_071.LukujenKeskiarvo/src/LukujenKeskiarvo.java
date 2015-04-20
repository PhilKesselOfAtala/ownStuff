
import java.util.ArrayList;

public class LukujenKeskiarvo {

    // Kopioi tänne edellisen tehtävän metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int sum = 0;
        
        for (Integer lista1 : lista) {
            sum += lista1;
        }
        
        /*for (int i = 0; i < lista.size(); i++) {
           sum += lista.get(i);
        }*/        
        
        return sum;
    }
    

    public static double keskiarvo(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double ka = (double) summa(lista) / lista.size();
        return ka;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Keskiarvo: " + keskiarvo(lista));
    }
}