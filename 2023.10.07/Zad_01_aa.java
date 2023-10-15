import java.util.Scanner;

public class Zad_01_aa
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double wynik = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            int silnia = 1;

            
            for (int j = 1; j <= i; j++) {
                silnia *= j;
            }

            if (i % 2 == 1) {
                wynik -= liczba / silnia; 
            } else {
                wynik += liczba / silnia; 
            }
        }

        System.out.println("Wynik wyrażenia -a₁/1! + a₂/2! - ... + (-1)ⁿ * aₙ/n! wynosi: " + wynik);

        scanner.close();
    }
}