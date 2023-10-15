import java.util.Scanner;

public class Zad_02_3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int dodatnie = 0;
        int ujemne = 0;
        int zerowe = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą nr " + (i + 1) + ": ");
            double liczba = scanner.nextDouble();

            if (liczba > 0) {
                dodatnie++;
            } else if (liczba < 0) {
                ujemne++;
            } else {
                zerowe++;
            }
        }

        System.out.println("Liczba liczb dodatnich: " + dodatnie);
        System.out.println("Liczba liczb ujemnych: " + ujemne);
        System.out.println("Liczba zer: " + zerowe);

        scanner.close();
    }
}