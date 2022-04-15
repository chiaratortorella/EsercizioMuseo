package museo;
import java.util.ArrayList;

public class Opere{

    String titolo;
    Autore autore;
    int codice;

    public int getCodice() {
        return codice;
    }

    public Opere(String titolo, Autore autore, int codice) {
        this.titolo = titolo;
        this.autore = autore;
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }


/*    @Override
    public int compareTo(Opere o) {
        int risultato = 0;
        if (o instanceof Quadri) {
            risultato = (((Quadri) this).getTecnicaUsata()).compareTo(((Quadri) o).getTecnicaUsata());
            if (risultato == 0) {
                risultato = this.autore.getCognome().compareTo(((Quadri) o).autore.getCognome());
            }
            return -risultato;
        } else if (o instanceof Statue) {
            risultato = (((Statue) this).getMateriale()).compareTo(((Statue) o).getMateriale());
            if (risultato == 0) {
                risultato = this.autore.getCognome().compareTo(((Statue) o).autore.getCognome());
            }
            return -risultato;
        }
        return risultato;
    }*/
}
