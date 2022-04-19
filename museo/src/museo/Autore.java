package museo;

import java.time.LocalDate;
import java.util.Date;

public class Autore {

    private String nome;
    private String cognome;

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    private LocalDate dataNascita;

    public Autore(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }


    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + dataNascita + ")";
    }
}
