package museo.comparators;

import museo.Autore;

import java.util.Comparator;

public class ComparatorAutoreEta implements Comparator<Autore> {

    @Override
    public int compare(Autore o1, Autore o2) {
        int risultato = 0;
        risultato = o1.getDataNascita().compareTo(o2.getDataNascita());
        if(risultato == 0){
            risultato = o1.getCognome().compareTo(o2.getCognome());
        }
        return risultato;
    }
}
