
public class ParillisetLuvut {

    public static void main(String[] args) {
        // KIRJOITA OHJELMASI TÄHÄN
        int luku = 0;
        
        while (true) {
            if (luku % 2 == 0 && luku < 100) {
                luku += 2;
                System.out.println(luku);
            } else {
                break;
            }
        }        
    }
}
