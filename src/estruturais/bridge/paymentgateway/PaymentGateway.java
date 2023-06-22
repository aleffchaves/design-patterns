package estruturais.bridge.paymentgateway;

public interface PaymentGateway {

    void paymentProcess(final Double amount);
    void paymentCancel();
}
