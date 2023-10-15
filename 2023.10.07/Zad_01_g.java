import java.util.Scanner;

public class Zad_01_g
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double suma = 0.0;
        double iloczyn = 1.0; 

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            suma += liczba;
            iloczyn *= liczba;
        }

        System.out.println("Suma liczb a₁ + a₂ + ... + aₙ wynosi: " + suma);
        System.out.println("Iloczyn liczb a₁ * a₂ * ... * aₙ wynosi: " + iloczyn);

        scanner.close();
    }
}