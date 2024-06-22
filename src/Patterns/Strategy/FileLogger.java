package Patterns.Strategy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {

    public FileLogger() {
    }

    @Override
    public void log(String message) {
        String fileToLogTo = "src/Patterns/Strategy/log.txt";
        File file = new File(fileToLogTo);

        try (PrintWriter printWriter = new PrintWriter(file)){

            printWriter.println(message);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
