package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        LoggerCreator fileLoggerCreator = new FileLoggerCreator();
        Logger fileLogger = fileLoggerCreator.createLogger();
        fileLogger.logMessage("Hello from File Logger!");

        LoggerCreator consoleLoggerCreator = new ConsoleLoggerCreator();
        Logger consoleLogger = consoleLoggerCreator.createLogger();
        consoleLogger.logMessage("Hello from Console Logger!");
    }
}
