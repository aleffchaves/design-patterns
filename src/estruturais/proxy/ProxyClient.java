package estruturais.proxy;

public class ProxyClient {
    public static void main(String[] args) {

        PaymentServiceProxy paymentProxy = new PaymentServiceProxy();
        paymentProxy.pay(10.0);

        PaymentServiceImpl payment = new PaymentServiceImpl();
        payment.pay(10.0);
    }
}
