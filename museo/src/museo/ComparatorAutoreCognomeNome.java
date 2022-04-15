package museo;

import java.util.Comparator;

public class ComparatorAutoreCognomeNome implements Comparator<Autore> {
    @Override
    public int compare(Autore o1, Autore o2) {
        int risultato = 0;
        risultato = (o1.getCognome()).compareTo(o2.getCognome());
        if (risultato == 0) {
            risultato = o1.getNome().compareTo(o2.getNome());
        }
        return risultato;
    }
}
