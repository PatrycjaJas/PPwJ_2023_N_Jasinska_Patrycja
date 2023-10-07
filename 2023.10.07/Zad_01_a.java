import java.util.Scanner;

public class Zad_01_a 
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);            
            
            System.out.print("Podaj liczbę naturalną n: ");
            int n = scanner.nextInt();            
        
            double suma = 0.0;            
            
            System.out.println("Podaj " + n + " liczb rzeczywistych:");
            for (int i = 0; i < n; i++) {
                double liczba = scanner.nextDouble();
                suma += liczba;
            }
            
            
            System.out.println("Suma liczb wynosi: " + suma);
            
            
            scanner.close();
        }
    
    

}