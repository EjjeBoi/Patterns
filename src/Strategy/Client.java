package Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(50.0);

        paymentProcessor.setPaymentStrategy(new OtherCardPayment());
        paymentProcessor.processPayment(45.0);
    }
}