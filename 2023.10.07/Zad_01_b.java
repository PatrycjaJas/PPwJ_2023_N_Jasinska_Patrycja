import java.util.Scanner;

public class Zad_01_b 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double iloczyn = 1.0;  

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę rzeczywistą a" + i + ": ");
            double liczba = scanner.nextDouble();
            iloczyn *= liczba;
        }

        System.out.println("Iloczyn liczb a1 * a2 * ... * an wynosi: " + iloczyn);

        scanner.close();
    }
}