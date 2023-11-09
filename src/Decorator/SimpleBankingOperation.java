package Decorator;

class SimpleBankingOperation implements BankingOperation {
    public String getDescription() {
        return "Simple Banking Operation";
    }

    public double cost() {
        return 5.0;
    }
}
