
import java.util.ArrayList;
import java.util.Scanner;

public class OnkoLukuListalla {

    public static boolean onkoListallaUseasti(ArrayList<Integer> lista, int luku) {
        // kirjoita koodia tähän
        boolean a = false;
        
        for (int i : lista) {
            if (i == luku && a) {
                return true;
            } else if (i == luku) {
                a = true;
            }
        }
        
        return false;  
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (onkoListallaUseasti(lista, luku)) {
            System.out.println(luku + " on listalla useasti.");
        } else {
            System.out.println(luku + " ei ole listalla useasti.");
        }
    }
}
