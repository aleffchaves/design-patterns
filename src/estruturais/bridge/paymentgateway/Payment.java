package estruturais.bridge.paymentgateway;

abstract class Payment {

    protected PaymentGateway paymentGateway;

    Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    abstract void doPayment(final Double amount);
    abstract void doCancelPayment();
}
