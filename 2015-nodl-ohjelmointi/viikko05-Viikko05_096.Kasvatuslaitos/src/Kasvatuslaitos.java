public class Kasvatuslaitos {
    private int punnitusLaskuri;

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        punnitusLaskuri += 1;
        return henkilo.getPaino();
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset() {
        return punnitusLaskuri;
    }

}
