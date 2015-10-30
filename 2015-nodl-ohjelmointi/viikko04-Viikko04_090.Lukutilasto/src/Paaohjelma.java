import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtäviä 90.3 ja 90.4 tehdessäsi
        
        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!

        Lukutilasto summaTilasto = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        /*tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(5);
        tilasto.lisaaLuku(1);
        tilasto.lisaaLuku(2);*/
        System.out.println("Anna lukuja: ");        
        System.out.println("Keskiarvo: " + summaTilasto.keskiarvo());

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());

            if (luku <= -1) {
                break;
            } else {
                summaTilasto.lisaaLuku(luku);
                if (luku % 2 == 0) {
                    parilliset.lisaaLuku(luku);
                } else {
                    parittomat.lisaaLuku(luku);
                } 
            }
        }
        
        //System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        System.out.println("Summa: " + summaTilasto.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + parittomat.summa());
        System.out.println("Keskiarvo: " + summaTilasto.keskiarvo());
    }
}
