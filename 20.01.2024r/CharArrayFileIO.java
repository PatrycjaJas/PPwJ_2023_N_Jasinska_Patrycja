import java.io.*;

public class CharArrayFileIO {
    public static void main(String[] args) {
        char[][] charArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        saveCharArrayToFile(charArray, "array.txt");
        char[][] readArray = readCharArrayFromFile("array.txt");

        // Do something with the readArray if needed
    }

    private static void saveCharArrayToFile(char[][] array, String fileName) {
        try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
            for (char[] row : array) {
                for (char element : row) {
                    writer.write(element);
                }
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static char[][] readCharArrayFromFile(String fileName) {
        char[][] result = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int row = 0;
            int col = 0;

            while ((line = reader.readLine()) != null) {
                if (result == null) {
                    result = new char[line.length()][];
                }

                result[row] = new char[line.length()];
                col = 0;

                for (char ch : line.toCharArray()) {
                    result[row][col++] = ch;
                }

                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
