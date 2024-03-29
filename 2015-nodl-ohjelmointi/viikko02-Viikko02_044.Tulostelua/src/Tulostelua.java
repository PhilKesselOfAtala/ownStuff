
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 44.1
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

    public static void tulostaNelio(int sivunpituus) {
        // 44.2
        int i = 0;
        while (true) {
            if (i < sivunpituus) {
                tulostaTahtia(sivunpituus);
                i++;
            } else {          
                break;
            }
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // 44.3
        int i = 0;
        while (true) {
            if (i < korkeus) {
                tulostaTahtia(leveys);
                i++;
            } else {        
                break;
            }
        }
    }

    public static void tulostaKolmio(int koko) {
        // 44.4
        int i = 0;
        while (true) {
            i++;
            if (i <= koko) {
                tulostaTahtia(i);   
            } else {        
                break;
            }
        }    
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(5);
        tulostaTahtia(3);
        tulostaTahtia(9);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(4);
        System.out.println("\n---");
    }

}
