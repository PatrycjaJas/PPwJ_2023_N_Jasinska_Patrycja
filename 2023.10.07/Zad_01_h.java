import java.util.Scanner;

public class Zad_01_h
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double wynik = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            if (i % 2 == 1) {
                wynik += liczba;
            } else {
                wynik -= liczba;
            }
        }

        System.out.println("Wynik wyrażenia a₁ - a₂ + a₃ - ... + (-1)ⁿ⁺¹ * aₙ wynosi: " + wynik);

        scanner.close();
    }
}