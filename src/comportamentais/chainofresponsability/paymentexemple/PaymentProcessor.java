package comportamentais.chainofresponsability.paymentexemple;

//Interface para o processador de pagamento
public interface PaymentProcessor {
    void executeNext(final PaymentProcessor nextProcessor);
    void processPayment(final Double amount);
}
