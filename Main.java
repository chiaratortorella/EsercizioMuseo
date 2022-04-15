package museo;

import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String[] args) throws NumeroSconosciutoException {

        ComparatorQuadriNomeTecnica cq = new ComparatorQuadriNomeTecnica();
        TreeSet<Quadri> quadri = new TreeSet<>(cq);

        ComparatorQuadriNomiAutore cqna = new ComparatorQuadriNomiAutore();
        TreeSet<Quadri> quadriautore = new TreeSet<>(cqna);

        ComparatorStatueNomeMateriale cnm = new ComparatorStatueNomeMateriale();
        TreeSet<Statue> statueMateriale = new TreeSet<>(cnm);

        ComparatorStatueNomeAutore csna = new ComparatorStatueNomeAutore();
        TreeSet<Statue> statueAutore = new TreeSet<>(csna);

        ComparatorAutoreEta cae = new ComparatorAutoreEta();
        TreeSet<Autore> autoriEta = new TreeSet<>(cae);

        ComparatorAutoreCognomeNome cacn = new ComparatorAutoreCognomeNome();
        TreeSet<Autore> autoreNomeCognome = new TreeSet<>(cacn);

        ComparatorStatueAltezza csa = new ComparatorStatueAltezza();
        TreeSet<Statue> statueAltezza = new TreeSet<>(csa);

        ComparatorStatueTitolo cst = new ComparatorStatueTitolo();
        TreeSet<Statue> statueTitolo = new TreeSet<>(cst);

        ComparatorQuadriTitolo cqt = new ComparatorQuadriTitolo();
        TreeSet<Quadri> quadriTitolo = new TreeSet<>(cqt);

        Autore a1 = new Autore("vincent", "Van Gogh", LocalDate.of(1853, 3, 30));
        Autore a2 = new Autore("Sandro", "Botticelli", LocalDate.of(1445, 3, 1));
        Autore a3 = new Autore("Leonardo", "Da Vinci", LocalDate.of(1452, 4, 15));
        Autore a4 = new Autore("Lorenzo", "Bernini", LocalDate.of(1598, 12, 7));
        Autore a5 = new Autore("Antonio", "Canova", LocalDate.of(1757, 11, 1));
        Autore a6 = new Autore("Michelangelo", "Buonarroti", LocalDate.of(1564, 02, 15));

        Statue s1 = new Statue("Il david", a6, 4, 5.20, 4);
        Statue s2 = new Statue("Amore e Psiche", a5, 6, 1.55, 5);
        Statue s3 = new Statue("Il ratto di proserpina", a4, 5, 2.55, 6);

        Quadri q1 = new Quadri("La Notte Stellata", a1, "olio", 1);
        Quadri q2 = new Quadri("La nascita di Venere", a2, "sale", 2);
        Quadri q3 = new Quadri("L'Ultima Cena", a3, "pepe", 3);
        Quadri q4 = new Quadri("La Gioconda", a3, "pepe", 3);


        quadri.add(q1);
        quadri.add(q2);
        quadri.add(q3);

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




        Scanner sc = new Scanner(System.in);
        int n;
        try {

        do {
            System.out.println();
            System.out.println("Quale ordinamento vuoi vedere? " +
                    "\n [1]: ordina quadri in base alla tecnica" +
                    "\n [2]: ordina quadri in base all'autore" +
                    "\n [3]: ordina statue in basse al materiale" +
                    "\n [4]: ordina statue in base all'autore" +
                    "\n [5]: ordina autori in base all'età" +
                    "\n [6]: scegli i criteri di ordinamento personalizzati" +
                    "\n [0]: arrivederci!");

            n = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Quadri ordinati in base alla tecnica");
                        quadri.forEach(System.out::println);
                        break;
                    case 2:
                        System.out.println("Quadri ordinati in base all'autore");
                        quadriautore.forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("Statue ordinate in base al materiale");
                        statueMateriale.forEach(System.out::println);
                        break;
                    case 4:
                        System.out.println("Statue ordinate in base all'autore");
                        statueAutore.forEach(System.out::println);
                        break;
                    case 5:
                        System.out.println("Autori ordinati in base all'età");
                        autoriEta.forEach(System.out::println);
                        break;
                    case 6:
                        System.out.println("Quale vuoi ordinare? \n [1]: quadri" +
                                "\n [2]: statue" +
                                "\n [3]: autori");
                        int tipo = sc.nextInt();
                        switch (tipo){
                            case 1:
                                System.out.println("Rispetto a quale parametro vuoi ordinarlo?" +
                                        "[1]: ");
                                int ordinamento = sc.nextInt();
                                switch (ordinamento){
                                    case 1:
                                        System.out.println("Quadri ordinati in base alla tecnica");
                                        quadri.forEach(System.out::println);
                                        break;
                                }
                        }
                        break;
                    default:
                        throw new NumeroSconosciutoException("Devi inserire uno dei numeri indicati sopra!");
                }
            } while (n != 0) ;
            System.out.println("Arrivederci!");

        } catch(InputMismatchException e){
            System.err.println("Devi inserire un numero!");
        } finally {
            sc.close();
        }
    }


    public static TreeSet<Object> scegliTipo(int tipo,int ordinamento){
![](../../../../AppData/Local/Temp/download.jpg)
    }

}
