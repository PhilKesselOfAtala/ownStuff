
import java.util.ArrayList;
import java.util.Scanner;

public class KaikkiEri {

    public static boolean kaikkiEri(ArrayList<Integer> luvut) {
        // kirjoita koodia tähän
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for (int i : luvut) {
            if (!temp.contains(i)) {
                temp.add(i);
            } else {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();

        System.out.println("Anna lukuja, -99 lopettaa:");

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -99) {
                break;
            }
            luvut.add(luku);
        }

        if (kaikkiEri(luvut)) {
            System.out.println("Kaikki syöttämäsi luvut olivat erisuuruisia");
        } else {
            System.out.println("Syöttämiesi lukujen joukossa oli samansuuruisia");
        }
    }
}
