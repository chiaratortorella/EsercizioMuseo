package museo.comparators;

import museo.Quadri;

import java.util.Comparator;

public class ComparatorQuadriTitolo implements Comparator<Quadri> {
    @Override
    public int compare(Quadri o1, Quadri o2) {
        int risultato = 0;
        risultato = o1.getTitolo().compareTo(o2.getTitolo());
        if(risultato == 0){
            risultato = -((o1.autore.getCognome()).compareTo(o2.autore.getCognome()));
        }
         return risultato;
    }
}
