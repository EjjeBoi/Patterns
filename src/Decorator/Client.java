package Decorator;

public class Client {
    public static void main(String[] args) {
        BankingOperation operation = new SimpleBankingOperation();
        System.out.println("Description: " + operation.getDescription());
        System.out.println("Cost: " + operation.cost());

        BankingOperation insuredOperation = new InsuranceDecorator(operation);
        System.out.println("Description: " + insuredOperation.getDescription());
        System.out.println("Cost: " + insuredOperation.cost());

        BankingOperation loanedOperation = new LoanDecorator(operation);
        System.out.println("Description: " + loanedOperation.getDescription());
        System.out.println("Cost: " + loanedOperation.cost());

        BankingOperation insuredAndLoanedOperation = new LoanDecorator(new InsuranceDecorator(operation));
        System.out.println("Description: " + insuredAndLoanedOperation.getDescription());
        System.out.println("Cost: " + insuredAndLoanedOperation.cost());
    }
}