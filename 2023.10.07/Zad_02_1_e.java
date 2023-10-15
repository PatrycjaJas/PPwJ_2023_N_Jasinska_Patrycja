import java.util.Scanner;

public class Zad_02_1_e
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscSpelniaWarunek = 0;

        for (int k = 1; k <= n; k++) {
            System.out.print("Podaj liczbę naturalną nr " + k + ": ");
            int liczba = scanner.nextInt();

            if ((1 << k) < liczba && liczba < silnia(k)) {
                iloscSpelniaWarunek++;
            }
        }

        System.out.println("Liczba liczb spełniających warunek 2^k < ak < k!: " + iloscSpelniaWarunek);

        scanner.close();
    }

    public static int silnia(int k) {
        int wynik = 1;
        for (int i = 1; i <= k; i++) {
            wynik *= i;
        }
        return wynik;
    }
}