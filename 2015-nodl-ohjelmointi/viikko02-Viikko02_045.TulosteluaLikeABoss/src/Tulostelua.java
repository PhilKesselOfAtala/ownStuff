
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 40.1
        int i = 0;
        while (true) {
            if (i < maara) {
                System.out.print("*");
                i++;
            } else {
                System.out.println("");            
                break;
            }
        }         
    }

    public static void tulostaTyhjaa(int maara) {
        // 40.1
        int i = 0;
        while (true) {
            if (i < maara) {
                System.out.print(" ");
                i++;
            } else {
                break;
            }
        }         
    }

    public static void tulostaKolmio(int koko) {
        // 40.2
        int i = 0;
        int b = koko - 1;
        while (i < koko) {
            tulostaTyhjaa(b); 
            tulostaTahtia(i + 1);
            i++;
            b--;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // 40.3      
        int tahdet = 1;
        int rivi = 1;
        int tyhjat = 0;
        int jalusta = 0;
 
        while (rivi <= korkeus) {
            tyhjat = korkeus - rivi;
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(tahdet);
            tahdet = tahdet + 2;
            rivi++;
        }

        int i = 0;
        while (i < 2) {
            i++;
            jalusta = korkeus - 2;
            tulostaTyhjaa(jalusta);
            tulostaTahtia(3);
        }

    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
