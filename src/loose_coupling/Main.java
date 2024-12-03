package loose_coupling;

interface PaymentProcessor {

    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with credit card");
    }
}

class UPIProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with UPI");
    }
}

//Step 3: Use the Interface for Loose Coupling
class PaymentService {
    private PaymentProcessor paymentProcessor;  // interface

    // Constructor injection for loose coupling
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService1 = new PaymentService(new CreditCardProcessor());
        paymentService1.makePayment(1000);

        PaymentService paymentService2 = new PaymentService(new UPIProcessor());
        paymentService2.makePayment(3000);
    }
}
