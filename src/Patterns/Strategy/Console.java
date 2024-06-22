package Patterns.Strategy;

public class Console {

    public static void logMessage(Logger logger, String message) {
        logger.log(message);
    }
}
