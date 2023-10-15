import java.util.Scanner;

public class Zad_02_1_a
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscNieparzystych = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę naturalną nr " + i + ": ");
            int liczba = scanner.nextInt();

            if (liczba % 2 != 0) {
                iloscNieparzystych++;
            }
        }

        System.out.println("Liczba liczb nieparzystych: " + iloscNieparzystych);

        scanner.close();
    }
}