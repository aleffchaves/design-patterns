package estruturais.bridge.paymentgateway;

public class Stripe implements PaymentGateway {

    @Override
    public void paymentProcess(final Double amount) {
        System.out.println("Payment processing by Stripe");
    }

    @Override
    public void paymentCancel() {
        System.out.println("Payment cancelled by Stripe");
    }
}
