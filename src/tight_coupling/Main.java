package tight_coupling;

//Step 1: Define a Specific Payment Processor
class CreditCardProcessor {

    public void processPayment(double amount) {
        System.out.println("Payment with credit card");
    }
}

//Step 2: Create a Tightly Coupled PaymentService Class
class PaymentService {
    private CreditCardProcessor creditCardProcessor;

    public PaymentService(){
        this.creditCardProcessor = new CreditCardProcessor(); // Direct instantiation
    }

    public void makePayment(double amount){
        creditCardProcessor.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(1000);
    }
}
