package comportamentais.chainofresponsability.paymentexemple;

public class CreditCardPaymentProcessor extends AbstractPaymentProcessor {
    private final Double amountLimit = 1200.0;

    @Override
    boolean canProcessPayment(Double amount) {
        return amount <= amountLimit;
    }

    @Override
    void doProcessPayment(Double amount) {
        System.out.println("Payment process has been processed by credit card processor with the value: " + amount);
    }
}
