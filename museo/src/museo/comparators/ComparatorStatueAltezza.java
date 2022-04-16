package museo.comparators;

import museo.Statue;

import java.util.Comparator;

public class ComparatorStatueAltezza implements Comparator<Statue> {

    @Override
    public int compare(Statue o1, Statue o2) {
        int risultato = 0;
        risultato = o1.getAltezza() > o2.getAltezza() ? 1 : -1;
        if(risultato == 0){
            risultato = (o1.autore.getCognome()).compareTo(o2.autore.getCognome());
        }
        return risultato;
    }
}
