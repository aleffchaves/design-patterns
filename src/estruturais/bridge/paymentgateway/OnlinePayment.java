package estruturais.bridge.paymentgateway;

import static java.lang.System.*;

public class OnlinePayment extends Payment {

    OnlinePayment(final PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    void doPayment(final Double amount) {
        out.println("online payment received and processed");
        paymentGateway.paymentProcess(amount);
    }

    @Override
    void doCancelPayment() {
        out.println("cancelled online payment");
        paymentGateway.paymentCancel();
    }


    @Override
    public String toString() {
        return "OnlinePayment{" +
                "paymentGateway=" + paymentGateway +
                '}';
    }
}
