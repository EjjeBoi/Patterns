package FactoryMethod;

class FileLogger implements Logger {
    public void logMessage(String message) {
        System.out.println("Logging to file: " + message);
    }
}