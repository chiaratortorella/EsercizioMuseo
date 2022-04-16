package museo.comparators;

import museo.Quadri;

import java.util.Comparator;

public class ComparatorQuadriNomeTecnica implements Comparator<Quadri> {
    @Override
    public int compare(Quadri o1, Quadri o2) {
            int risultato = 0;
                risultato = (o1.getTecnicaUsata()).compareTo(o2.getTecnicaUsata());
                if (risultato == 0) {
                    risultato = o1.autore.getCognome().compareTo(o2.autore.getCognome());
                }
                return risultato;
        }
    }
