package comportamentais.chainofresponsability.paymentexemple;

public class BankTransferPaymentProcessor extends AbstractPaymentProcessor {
    private final Double amountLimit = 45000.0;

    @Override
    boolean canProcessPayment(Double amount) {
        return amount <= amountLimit;
    }

    @Override
    void doProcessPayment(Double amount) {
        System.out.println("Payment process has been processed with bank transfer processor with the value: " + amount);
    }
}
