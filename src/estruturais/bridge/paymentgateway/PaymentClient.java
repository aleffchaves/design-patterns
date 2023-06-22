package estruturais.bridge.paymentgateway;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentGateway paymentWithPayPall = new PayPall();
        PaymentGateway paymentWithStripe = new Stripe();

        OnlinePayment onlinePayment = new OnlinePayment(paymentWithStripe);
        onlinePayment.doPayment(10.0);
        onlinePayment.doCancelPayment();

        System.out.println(onlinePayment);

    }
}
