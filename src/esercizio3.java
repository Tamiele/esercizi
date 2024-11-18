import java.util.Scanner;

public class esercizio3 {
    Scanner scanner = new Scanner(System.in);

    public void perimetroRettangolo() {
        System.out.print("inserisci dimensione base rettangolo");
        double a = scanner.nextDouble();
        System.out.print("inserisci dimensione altezza rettangolo");
        double b = scanner.nextDouble();

        double perimetroTotale = 2 * (a + b);
        System.out.print(perimetroTotale);
        scanner.close();

    }

    public void pariDispari() {
        System.out.print("inserisci numero");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.print("0");
        } else {
            System.out.print("1");

        }
        scanner.close();

    }

    public void perimetroTriangolo() {
        System.out.print("inserisci dimensione base Triangolo");
        double a = scanner.nextDouble();
        System.out.print("inserisci dimensione altezza Triangolo");
        double b = scanner.nextDouble();
        double perimetroTotale = (a * b) / 2;
        System.out.print(perimetroTotale);
        scanner.close();
    }
}
