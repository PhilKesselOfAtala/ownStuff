import java.util.ArrayList;

public class Varianssi {
    // Kopioi tänne tehtävän 70 metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int sum = 0;
        
        for (Integer i : lista) {
            sum += i;
        }
       
        return sum;
    }
    
    // Kopioi tänne tehtävän 71 metodi keskiarvo
    public static double keskiarvo(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double ka = (double) summa(lista) / lista.size();
        return ka;
    }

    public static double varianssi(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double a = 0;
        double b = 0;
        double c = keskiarvo(lista);
        
        for (Integer i : lista) {
            a = Math.pow(i - c, 2);
            b += a;
        }

        b = b / (lista.size() - 1);    
                
        return b;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Varianssi: " + varianssi(lista));
    }
}
