import java.util.Scanner; // import ktory potrzebny do wczytywania danych

public class Zad_00
{   
    public static void main(String[]args)
    {   System.out.print("Podaj liczbę całkowitą "); // wypisanie napisu na ekranie
        Scanner scanner = new Scanner(System.in); // potrzebne do wczytywania danych z klawiatury

        int liczba = scanner.nextInt(); //wczytywanie danych całkowitych

        System.out.print("Podwojona wartość liczby " + (2*liczba));
    }
   } 