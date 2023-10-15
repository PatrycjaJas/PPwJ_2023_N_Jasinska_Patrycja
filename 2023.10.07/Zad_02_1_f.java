import java.util.Scanner;

public class Zad_02_1_f
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscSpelniaWarunek = 0;

        for (int k = 1; k <= n; k++) {
            System.out.print("Podaj liczbę naturalną nr " + k + ": ");
            int liczba = scanner.nextInt();

            if (k % 2 == 1 && liczba % 2 == 0) {
                iloscSpelniaWarunek++;
            }
        }

        System.out.println("Liczba liczb o nieparzystym numerze i parzystych wartościach: " + iloscSpelniaWarunek);

        scanner.close();
    }
}