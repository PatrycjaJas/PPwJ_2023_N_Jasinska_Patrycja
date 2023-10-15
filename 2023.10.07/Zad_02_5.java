import java.util.Scanner;

public class Zad_02_5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int iloscSasiadujacych = 0;
        double poprzednia = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą nr " + (i + 1) + ": ");
            double liczba = scanner.nextDouble();

            if (liczba > 0 && poprzednia > 0) {
                iloscSasiadujacych++;
            }

            poprzednia = liczba;
        }

        System.out.println("Ilość sąsiadujących par (a, b) takich, że a > 0 i b > 0: " + iloscSasiadujacych);

        scanner.close();
    }
}