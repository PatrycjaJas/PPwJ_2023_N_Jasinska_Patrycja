import java.util.Scanner;

public class Zad_01_d
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double sumaPierwiastkow = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            double pierwiastek = Math.sqrt(Math.abs(liczba)); 
            sumaPierwiastkow += pierwiastek; 
        }

        System.out.println("Pierwiastek z sumy pierwiastków |a1| + |a2| + ... + |an| wynosi: " + Math.sqrt(sumaPierwiastkow));

        scanner.close();
    }
}