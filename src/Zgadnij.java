import java.util.Scanner;

public class Zgadnij {
    public static void main(String[] args) {
        int poczatek = 100;
        int koniec = 200;
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int numer = scan.nextInt();
        while (!exit) {
            if (numer < poczatek) {
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj liczbę");
                numer = scan.nextInt();
            } else if (numer > koniec) {
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj liczbę");
                numer = scan.nextInt();
            } else if (numer % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę");
                numer = scan.nextInt();
            } else if (exit = true) {
                System.out.println("Twoja liczba jest ok");

            }
        }
    }
}
