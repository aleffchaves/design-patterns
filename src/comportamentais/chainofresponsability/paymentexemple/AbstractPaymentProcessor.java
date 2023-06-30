package comportamentais.chainofresponsability.paymentexemple;

//Implementação abstrata do processador de pagamento
public abstract class AbstractPaymentProcessor implements PaymentProcessor {

    private PaymentProcessor nextProcessor;

    @Override
    public void executeNext(final PaymentProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void processPayment(final Double amount) {
        if (canProcessPayment(amount)) {
            this.doProcessPayment(amount);
        } else if (this.nextProcessor != null) {
            this.nextProcessor.processPayment(amount);
        } else {
            System.out.println("Impossible to process payment!!!");
        }
    }

    abstract boolean canProcessPayment(final Double amount);
    abstract void doProcessPayment(final Double amount);
}
