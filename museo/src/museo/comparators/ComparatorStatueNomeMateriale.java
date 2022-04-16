package museo.comparators;

import museo.Statue;

import java.util.Comparator;

public class ComparatorStatueNomeMateriale implements Comparator<Statue>{
    @Override
    public int compare(Statue o1, Statue o2) {
        int risultato = 0;
        risultato = (o1.getMateriale()).compareTo(o2.getMateriale());
        if (risultato == 0) {
            risultato = o1.autore.getCognome().compareTo(o2.autore.getCognome());
        }
        if(risultato == 0){
            risultato = (o1.getTitolo().compareTo(o2.getTitolo()));
        }
        return -risultato;
    }
}

