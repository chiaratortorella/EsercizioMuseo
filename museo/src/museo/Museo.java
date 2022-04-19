package museo;

import museo.exceptions.OperaNonPresenteException;

import java.util.*;

public class Museo {

    private Map<Autore, ArrayList<Opere>> mappaAutoriOpere = new HashMap<>();
    private ArrayList<Opere> deposito;
    private ArrayList<Opere> esposizione;

    public ArrayList<Opere> getDeposito() {
        return deposito;
    }

    public void setDeposito(ArrayList<Opere> deposito) {
        this.deposito = deposito;
    }

    public Map<Autore,ArrayList<Opere>> getAutori() {
        return mappaAutoriOpere;
    }

    public void setAutori(Map<Autore, ArrayList<Opere>> autori) {
        this.mappaAutoriOpere = autori;
    }

    public ArrayList<Opere> getEsposizione() {
        return esposizione;
    }

    public void setEsposizione(ArrayList<Opere> esposizione) {
        this.esposizione = esposizione;
    }


    public Museo() {
        this.deposito = new ArrayList<>();
        this.esposizione = new ArrayList<>();
    }


    public void caricaOpera(Opere opera) {
        if (esposizione.size() < 6) {
            if (esposizione.contains(opera)) {
                System.out.println(opera.getTitolo() + " si trova gia in museo!");
            } else {
                esposizione.add(opera);
                System.out.println(opera.getTitolo() + " è stata aggiunta con successo!");
            }
        } else {
            if (deposito.contains(opera)) {
                System.out.println(opera.getTitolo() + " non può essere aggiunta perchè già presente!");
            } else {
                deposito.add(opera);
                System.out.println(opera.getTitolo() + " aggiunta al deposito");
            }
        }
    }

    public String stampaSala(){
        String sala= "";
        System.out.println("In museo troviamo: ");
        for(Opere k: esposizione){
            sala += k.toString();
            System.out.println(k);
        }
        return sala;
    }

    public String stampaDeposito(){
        System.out.println("Nel deposito c'è: ");
        String depositoopere= "";
        for(Opere y: deposito){
            depositoopere += y.toString();
            System.out.println(y);
        }
        return depositoopere;
    }

    public Opere cercaOpera(int e) throws OperaNonPresenteException {
        System.out.println("Inserisci il codice dell'opera: ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if(s <= 6){
            for(Opere h : esposizione){
                if(h.getCodice() == s){
                    System.out.println(h.getTitolo() + " si trova in museo");
                }
            }
            for(Opere p : deposito){
                if(p.getCodice() == s){
                    System.out.println(p.getTitolo() + " si trova in deposito");
                }
            }
            throw new OperaNonPresenteException("Opera non presente in museo!");
        } else {
            System.out.println("L'opera non esiste!");
        }
        return cercaOpera(e);
    }


    public void cercaAutore(Autore autore){
        for(Map.Entry a : mappaAutoriOpere.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
