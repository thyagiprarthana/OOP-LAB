abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Processing credit card payment of $" + getAmount());
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(150.75);
        payment.processPayment(); // Prints: Processing credit card payment of $150.75
    }
}
