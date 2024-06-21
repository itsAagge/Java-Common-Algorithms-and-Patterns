package Files.PrintWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String filename = "src/Files/PrintWriter/print10tal.txt";
        printInFile(filename);
    }

    public static void printInFile(String filename) {
        File file = new File(filename);
        try (PrintWriter printWriter = new PrintWriter(file)){

            for (int i = 1; i <= 10; i++) {
                printWriter.println(i);
            }
            printWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
