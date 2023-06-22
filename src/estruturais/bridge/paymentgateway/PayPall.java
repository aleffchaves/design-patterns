package estruturais.bridge.paymentgateway;

public class PayPall implements PaymentGateway {

    @Override
    public void paymentProcess(Double amount) {
        System.out.println("Payment processing by PayPall: " + amount);
    }

    @Override
    public void paymentCancel() {
        System.out.println("Payment cancel by PayPall");
    }

    @Override
    public String toString() {
        return "PayPall{}";
    }
}
