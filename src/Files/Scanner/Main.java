package Files.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filename = "src/Files/PrintWriter/print10tal.txt";
        System.out.println(indeholderTal(filename, 11));
    }

    public static boolean indeholderTal(String filename, int tal) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int nummer = scanner.nextInt();
                if (nummer == tal) {
                   return true;
                }
            }

            scanner.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
