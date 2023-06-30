package comportamentais.chainofresponsability.paymentexemple;

public class PayPalPaymentProcessor extends AbstractPaymentProcessor {

    private final Double amountLimit = 100.0;

    @Override
    boolean canProcessPayment(Double amount) {
        return amount <= amountLimit;
    }

    @Override
    void doProcessPayment(Double amount) {
        System.out.println("Payment process has been processed with PayPal processor with the value: " + amount);
    }
}
