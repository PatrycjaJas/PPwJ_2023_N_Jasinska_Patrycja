import java.util.Scanner;

public class Zad_02_1_b
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscLiczbyPodzielnych = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę naturalną nr " + i + ": ");
            int liczba = scanner.nextInt();

            if (liczba % 3 == 0 && liczba % 5 != 0) {
                iloscLiczbyPodzielnych++;
            }
        }

        System.out.println("Liczba liczb podzielnych przez 3 i niepodzielnych przez 5: " + iloscLiczbyPodzielnych);

        scanner.close();
    }
}