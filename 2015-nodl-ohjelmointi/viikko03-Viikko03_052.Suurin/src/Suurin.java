
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {

        int tulos = 0;
               
        if (luku1 >= luku2 && luku1 >= luku3) {
            tulos = luku1;
        } else if (luku2 >= luku1 && luku2 >= luku3) {
            tulos = luku2;
        } else if (luku3 >= luku1 && luku3 >= luku2) {
            tulos = luku3;
        }
               
        return tulos;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3); //int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}