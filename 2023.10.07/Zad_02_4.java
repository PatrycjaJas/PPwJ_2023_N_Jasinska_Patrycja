import java.util.Scanner;

public class Zad_02_4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą nr " + (i + 1) + ": ");
            double liczba = scanner.nextDouble();

            min = Math.min(min, liczba);
            max = Math.max(max, liczba);
        }

        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);

        scanner.close();
    }
}