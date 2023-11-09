package Decorator;

class InsuranceDecorator implements BankingOperation {
    private BankingOperation bankingOperation;

    InsuranceDecorator(BankingOperation bankingOperation) {
        this.bankingOperation = bankingOperation;
    }

    public String getDescription() {
        return bankingOperation.getDescription() + ", Insurance";
    }

    public double cost() {
        return bankingOperation.cost() + 2.0;
    }
}
