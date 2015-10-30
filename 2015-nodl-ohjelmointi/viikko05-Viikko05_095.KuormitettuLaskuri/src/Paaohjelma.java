public class Paaohjelma {
    public static void main(String[] args) {
        // tee tänne testikoodia
        /*Laskuri a = new Laskuri();
        System.out.println(a.arvo());*/
        
        Laskuri b = new Laskuri(2, true);
        b.vahenna();b.vahenna();b.vahenna();
        System.out.println(b.arvo());
        
        Laskuri l = new Laskuri(900, false);
        l.vahenna(7);
        System.out.println(l.arvo());
        
        Laskuri u = new Laskuri(2, true);
        u.vahenna(4);
        System.out.println(u.arvo());
    }
}
