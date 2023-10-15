import java.util.Scanner;

public class Zad_01_f
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double sumaKwadratow = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            double kwadrat = liczba * liczba; 
            sumaKwadratow += kwadrat; 
        }

        System.out.println("Suma kwadratów a₁² + a₂² + ... + aₙ² wynosi: " + sumaKwadratow);

        scanner.close();
    }
}