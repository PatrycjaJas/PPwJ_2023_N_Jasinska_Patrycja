import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pełną ścieżkę do pliku tekstowego: ");
        String inputFilePath = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            List<String> lines = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            String outputFilePath = inputFilePath.replace(".txt", "Swapped.txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
                for (int i = 0; i < lines.size(); i += 2) {
                    if (i + 1 < lines.size()) {
                        bw.write(lines.get(i + 1) + "\n");
                    }
                    bw.write(lines.get(i) + "\n");
                }

                System.out.println("Plik " + inputFilePath + " został przetworzony. Wynik zapisano w pliku " + outputFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
