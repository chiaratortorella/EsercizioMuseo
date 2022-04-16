package museo;

import museo.comparators.*;
import museo.exceptions.NumeroSconosciutoException;

import java.time.LocalDate;
import java.util.*;

public class Main{

    static ComparatorQuadriNomeTecnica cq = new ComparatorQuadriNomeTecnica();
    static TreeSet<Quadri> quadriTecnica = new TreeSet<>(cq);

    static ComparatorQuadriNomiAutore cqna = new ComparatorQuadriNomiAutore();
    static TreeSet<Quadri> quadriautore = new TreeSet<>(cqna);

    static ComparatorQuadriTitolo cqt = new ComparatorQuadriTitolo();
    static TreeSet<Quadri> quadriTitolo = new TreeSet<>(cqt);

    static ComparatorStatueNomeMateriale cnm = new ComparatorStatueNomeMateriale();
    static TreeSet<Statue> statueMateriale = new TreeSet<>(cnm);

    static ComparatorStatueNomeAutore csna = new ComparatorStatueNomeAutore();
    static TreeSet<Statue> statueAutore = new TreeSet<>(csna);

    static ComparatorStatueAltezza csa = new ComparatorStatueAltezza();
    static TreeSet<Statue> statueAltezza = new TreeSet<>(csa);

    static ComparatorStatueTitolo cst = new ComparatorStatueTitolo();
    static TreeSet<Statue> statueTitolo = new TreeSet<>(cst);

    static ComparatorAutoreEta cae = new ComparatorAutoreEta();
    static TreeSet<Autore> autoriEta = new TreeSet<>(cae);

    static ComparatorAutoreCognomeNome cacn = new ComparatorAutoreCognomeNome();
    static TreeSet<Autore> autoreNomeCognome = new TreeSet<>(cacn);


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws NumeroSconosciutoException {

        Autore a1 = new Autore("Vincent", "Van Gogh", LocalDate.of(1853, 3, 30));
        Autore a2 = new Autore("Sandro", "Botticelli", LocalDate.of(1445, 3, 1));
        Autore a3 = new Autore("Leonardo", "Da Vinci", LocalDate.of(1452, 4, 15));
        Autore a4 = new Autore("Lorenzo", "Bernini", LocalDate.of(1598, 12, 7));
        Autore a5 = new Autore("Antonio", "Canova", LocalDate.of(1757, 11, 1));
        Autore a6 = new Autore("Michelangelo", "Buonarroti", LocalDate.of(1564, 02, 15));

        Statue s1 = new Statue("Il David", a6, 4, 5.20, 4);
        Statue s2 = new Statue("Amore e Psiche", a5, 6, 1.55, 5);
        Statue s3 = new Statue("Il Ratto di Proserpina", a4, 5, 2.55, 6);

        Quadri q1 = new Quadri("La Notte Stellata", a1, "olio", 1);
        Quadri q2 = new Quadri("La Nascita di Venere", a2, "sale", 2);
        Quadri q3 = new Quadri("L'Ultima Cena", a3, "pepe", 3);
        Quadri q4 = new Quadri("La Gioconda", a3, "pepe", 3);


        quadriTecnica.add(q1);
        quadriTecnica.add(q2);
        quadriTecnica.add(q3);

        quadriautore.add(q1);
        quadriautore.add(q2);
        quadriautore.add(q3);
        quadriautore.add(q4);

        statueMateriale.add(s1);
        statueMateriale.add(s2);
        statueMateriale.add(s3);

        statueAutore.add(s1);
        statueAutore.add(s2);
        statueAutore.add(s3);


        autoriEta.add(a1);
        autoriEta.add(a2);
        autoriEta.add(a3);
        autoriEta.add(a4);
        autoriEta.add(a5);
        autoriEta.add(a6);


        autoreNomeCognome.add(a1);
        autoreNomeCognome.add(a2);
        autoreNomeCognome.add(a3);
        autoreNomeCognome.add(a4);
        autoreNomeCognome.add(a5);
        autoreNomeCognome.add(a6);

        statueAltezza.add(s1);
        statueAltezza.add(s2);
        statueAltezza.add(s3);

        statueTitolo.add(s1);
        statueTitolo.add(s2);
        statueTitolo.add(s3);

        quadriTitolo.add(q1);
        quadriTitolo.add(q2);
        quadriTitolo.add(q3);

        Museo museo = new Museo();

        /*museo.caricaOpera(s1);
        museo.caricaOpera(s2);
        museo.caricaOpera(s3);
        museo.caricaOpera(q1);
        museo.caricaOpera(q2);
        museo.caricaOpera(q3);*/

        System.out.println();

        /*museo.stampaSala();
        System.out.println();

        museo.stampaDeposito();
        System.out.println();*/

        /*try{
            museo.cercaOpera(2);
        } catch (OperaNonPresente g){
            System.out.println(g.getMessage());
        }*/

        //quadri.forEach(System.out::println);
        //quadriautore.forEach(System.out::println);
        //statueMateriale.forEach(System.out::println);
        //statueAutore.forEach(System.out::println);
        //autoriEta.forEach(System.out::println);

        do{
            try{
        System.out.println();
            System.out.println("Quale ordinamento vuoi vedere? " +
                "\n [1]: Ordina QUADRI in base alla TECNICA" +
                "\n [2]: Ordina QUADRI in base all'AUTORE" +
                "\n [3]: Ordina STATUE in basse al MATERIALE" +
                "\n [4]: Ordina STATUE in base all'AUTORE" +
                "\n [5]: Ordina AUTORI in base all'ETA'" +
                "\n [6]: Criteri di ordinamento CUSTOM" +
                "\n [0]: Esci!");

            int number = sc.nextInt();

        switch (number) {
            case 0:
                System.out.println("Arrivederci!");
                return;
            case 1:
                System.out.println("QUADRI ordinati in base alla TECNICA");
                quadriTecnica.forEach(System.out::println);
                break;
            case 2:
                System.out.println("QUADRI ordinati in base all'AUTORE");
                quadriautore.forEach(System.out::println);
                break;
            case 3:
                System.out.println("STATUE ordinate in base al MATERIALE");
                statueMateriale.forEach(System.out::println);
                break;
            case 4:
                System.out.println("STATUE ordinate in base all'AUTORE");
                statueAutore.forEach(System.out::println);
                break;
            case 5:
                System.out.println("AUTORI ordinati in base all'ETA'");
                autoriEta.forEach(System.out::println);
                break;
            case 6:
                System.out.println("Quale vuoi ordinare?" +
                        "\n [1]: Quadri" +
                        "\n [2]: Statue" +
                        "\n [3]: Autori");
                int tipo = sc.nextInt();
                sceltaTipo(tipo);
                break;
            default:
                System.err.println("Inserire un valore valido!");
        }}catch (InputMismatchException e) {
                System.err.println("Inserire una cifra!");
                return;
            }
    }while (true);
    }

    public static void sceltaTipo(int tipo){
        int ordine;
        switch (tipo){
            case 1:
                System.out.println("Rispetto a quale parametro vuoi ordinarlo?\n" +
                        "[1]: Tecnica\n" +
                        "[2]: Autore\n" +
                        "[3]: Titolo");
                ordine = sc.nextInt();
                sceltaOrdinamentoQuadri(ordine);
                break;
            case 2:
                System.out.println("Rispetto a quale parametro vuoi ordinarlo?\n" +
                        "[1]: Materiale\n" +
                        "[2]: Autore\n" +
                        "[3]: Titolo\n" +
                        "[4]: Altezza");
                ordine = sc.nextInt();
                sceltaOrdinamentoStatue(ordine);
                break;
            case 3:
                System.out.println("Rispetto a quale parametro vuoi ordinarlo?\n" +
                        "[1]: Cognome\n" +
                        "[2]: Età");
                ordine = sc.nextInt();
                sceltaOrdinamentoAutori(ordine);
                break;
            default:
                System.err.println("Inserire un numero valido!");
        }


    }

    public static void sceltaOrdinamentoQuadri(int ordine){
        switch (ordine){
            case 1:
                System.out.println("QUADRI ordinati in base alla TECNICA");
                ordineDaSeguire(quadriTecnica);
                break;
            case 2:
                System.out.println("QUADRI ordinati in base all' AUTORE");
                ordineDaSeguire(quadriautore);
                break;
            case 3:
                System.out.println("QUADRI ordinati in base al TITOLO");
                ordineDaSeguire(quadriTitolo);
                break;
            default:
                System.err.println("Inserire un numero valido!");
        }
    }

    public static void sceltaOrdinamentoStatue(int ordine){
        switch (ordine) {
            case 1:
                System.out.println("STATUE ordinate in base al MATERIALE");
                ordineDaSeguire(statueMateriale);
                break;
            case 2:
                System.out.println("STATUE ordinate in base all'AUTORE");
                ordineDaSeguire(statueAutore);
                break;
            case 3:
                System.out.println("STATUE ordinate in base al TITOLO");
                ordineDaSeguire(statueTitolo);
                break;
            case 4:
                System.out.println("STATUE ordinate in base all'ALTEZZA");
                ordineDaSeguire(statueAltezza);
                break;
            default:
                System.err.println("Inserire un numero valido!");
        }
    }

    public static void sceltaOrdinamentoAutori(int ordine){
        switch (ordine) {
            case 1:
                System.out.println("AUTORI ordinati in base al COGNOME");
                ordineDaSeguire(autoreNomeCognome);
                break;
            case 2:
                System.out.println("AUTORI ordinati in base all'ETA'");
                ordineDaSeguire(autoriEta);
                break;
            default:
                System.err.println("Inserire un numero valido!");
        }
    }

    public static void ordineDaSeguire(TreeSet lista){
        System.out.println("Quale ordine vuoi seguire?\n" +
                "[1]- Ascendente\n" +
                "[2]- Discendente");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                lista.forEach(System.out::println);
                break;
            case 2:
                lista.descendingSet().forEach(System.out::println);
                break;
            default:
                System.err.println("Inserire un numero valido!");
        }
    }
}

