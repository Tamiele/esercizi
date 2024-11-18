public class Main {
    public static void main(String[] args) {
        esercizio1 esercizio1 = new esercizio1();

        //ciaoesercizio1.moltiplicazione();
        //esercizio1.concatenazione();

        String[] arrayOriginale = {"uno", "due", "tre", "quattro", "cinque"};


        String[] risultato = esercizio1.inserisciInArray(arrayOriginale, "ciao");


        System.out.println("Nuovo array:");
        for (String elemento : risultato) {
            System.out.println(elemento);
        }

        esercizio2 esercizio2 = new esercizio2();
        //esercizio2.concatStrring();

        esercizio3 esercizio3 = new esercizio3();
        //esercizio3.perimetroRettangolo();
        //esercizio3.pariDispari();
        //esercizio3.perimetroTriangolo();
    }
}