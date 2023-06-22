package estruturais.bridge.paymentgateway;

public class OfflinePayment extends Payment {

    OfflinePayment (final PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    void doPayment(Double amount) {
        System.out.println("Doing Offline Payment");
    }

    @Override
    void doCancelPayment() {
        System.out.println("Doing Cancel Offline Payment");
    }
}
