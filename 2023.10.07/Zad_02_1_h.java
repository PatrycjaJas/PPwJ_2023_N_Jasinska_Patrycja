import java.util.Scanner;

public class Zad_02_1_h
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscSpelniaWarunek = 0;

        for (int k = 1; k <= n; k++) {
            System.out.print("Podaj liczbę naturalną nr " + k + ": ");
            int liczba = scanner.nextInt();

            if (Math.abs(liczba) < k * k) {
                iloscSpelniaWarunek++;
            }
        }

        System.out.println("Liczba liczb spełniających warunek |ak| < k^2: " + iloscSpelniaWarunek);

        scanner.close();
    }
}