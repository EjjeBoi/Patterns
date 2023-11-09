package Strategy;

class OtherCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing diff card payment of " + amount);
    }
}
