package Decorator;

class LoanDecorator implements BankingOperation {
    private BankingOperation bankingOperation;

    LoanDecorator(BankingOperation bankingOperation) {
        this.bankingOperation = bankingOperation;
    }

    public String getDescription() {
        return bankingOperation.getDescription() + ", Loan";
    }

    public double cost() {
        return bankingOperation.cost() + 3.0;
    }
}
