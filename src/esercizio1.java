import java.util.Scanner;

public class esercizio1 {

    Scanner scanner = new Scanner(System.in);

    public void moltiplicazione() {

        System.out.print("inserisci primo Numero");
        int num1 = scanner.nextInt();

        System.out.print("inserisci secondo Numero");
        int num2 = scanner.nextInt();

        int totale = num1 * num2;
        System.out.print("il risultato della moltiplicazione è" + totale);
        scanner.close();
    }

    public void concatenazione() {
        System.out.println("inserisci una parola");
        String parola = scanner.next();
        System.out.print("inserisci un Numero");
        int num = scanner.nextInt();
        System.out.print(parola + num);
        scanner.close();

    }

    public String[] inserisciInArray(String[] arrayOriginale, String nuovaStringa) {

        String[] nuovoArray = new String[6];


        nuovoArray[0] = arrayOriginale[0];
        nuovoArray[1] = arrayOriginale[1];


        nuovoArray[2] = nuovaStringa;


        nuovoArray[3] = arrayOriginale[2];
        nuovoArray[4] = arrayOriginale[3];
        nuovoArray[5] = arrayOriginale[4];

        return nuovoArray;
    }
}
