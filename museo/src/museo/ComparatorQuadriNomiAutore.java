package museo;

import java.util.Comparator;

public class ComparatorQuadriNomiAutore implements Comparator<Quadri> {

    @Override
    public int compare(Quadri o1, Quadri o2) {
            int risultato = 0;
            risultato = -((o1.autore.getCognome()).compareTo(o2.autore.getCognome()));
            if (risultato == 0) {
                risultato = -(o1.autore.getNome().compareTo(o2.autore.getNome()));
            }
            if(risultato == 0){
                risultato = (o1.getTitolo().compareTo(o2.getTitolo()));
            }
            return risultato;
        }
}
