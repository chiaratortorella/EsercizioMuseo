package museo;

import java.util.Comparator;

public class Quadri extends Opere {

    public String getTecnicaUsata() {
        return tecnicaUsata;
    }

    private String tecnicaUsata;

    public Quadri(String titolo, Autore autore, String tecnicaUsata,int codice){
        super(titolo,autore,codice);
        setTecnicaUsata(tecnicaUsata);
    }

    public void setTecnicaUsata(String s){
        for(Tecnica t : Tecnica.values()){
            if(t.getN().equals(s)){
                this.tecnicaUsata = t.name();
            }
        }
    }

    @Override
    public String toString() {
        return titolo + " (" + tecnicaUsata + ")";
    }
}
