package FactoryMethod;

class ConsoleLogger implements Logger {
    public void logMessage(String message) {
        System.out.println("Logging to console: " + message);
    }
}
