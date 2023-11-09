package FactoryMethod;

class FileLoggerCreator extends LoggerCreator {
    public Logger createLogger() {
        return new FileLogger();
    }
}
