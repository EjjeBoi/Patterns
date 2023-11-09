package FactoryMethod;

class ConsoleLoggerCreator extends LoggerCreator {
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}