import java.util.Scanner;

public class Zad_02_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        double podwojnaSuma = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą nr " + (i + 1) + ": ");
            double liczba = scanner.nextDouble();
            
            if (liczba > 0) {
                podwojnaSuma += liczba * 2;
            }
        }

        System.out.println("Podwójna suma liczb dodatnich wynosi: " + podwojnaSuma);

        scanner.close();
    }
}