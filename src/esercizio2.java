import java.util.Scanner;

public class esercizio2 {
    Scanner scanner = new Scanner(System.in);

    public void concatStrring() {
        System.out.print("inserisci prima Parola");
        String parola1 = scanner.nextLine();
        System.out.print("inserisci seconda Parola");
        String parola2 = scanner.nextLine();
        System.out.print("inserisci terrza Parola");
        String parola3 = scanner.nextLine();
        System.out.print(parola1 + " " + parola2 + " " + parola3);
        System.out.print(" " + parola3 + " " + parola2 + " " + parola1);
        scanner.close();
    }

}
