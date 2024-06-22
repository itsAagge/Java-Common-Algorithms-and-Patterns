package Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        String messageToLog = "Test af log";

        Logger logger = new FileLogger(); //Strategy to log a message to file
        Console.logMessage(logger, messageToLog);

        logger = new ConsoleLogger(); //Strategy to log to a message to the console
        Console.logMessage(logger, messageToLog);
    }
}
