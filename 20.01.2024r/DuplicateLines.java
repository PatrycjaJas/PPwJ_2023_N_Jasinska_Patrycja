import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DuplicateLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pełną ścieżkę do pliku tekstowego: ");
        String inputFilePath = scanner.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            String outputFilePath = inputFilePath.replace(".txt", "x2.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));

            for (int i = 0; i < 10; i++) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }

                bw.write(line + "\n");
                bw.write(line + "\n");
            }

            System.out.println("Plik " + inputFilePath + " został przetworzony. Wynik zapisano w pliku " + outputFilePath);

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
