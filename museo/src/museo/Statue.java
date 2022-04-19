package museo;

public class Statue extends Opere {
    public String getMateriale() {
        return materiale;
    }

    String materiale;

    public double getAltezza() {
        return altezza;
    }

    double altezza;

    public Statue(String titolo, Autore autore, int materiale, double altezza, int codice) {
        super(titolo, autore, codice);
        setMateriale(materiale);
        this.altezza = altezza;
    }

    public void setMateriale(int w) {
        for (Materiale m : Materiale.values()) {
            if (m.getG() == w) {
                this.materiale = m.name();
            }
        }
    }

    @Override
    public String toString() {
        return titolo + " (" + materiale + ")";
    }


}
