package estruturais.proxy;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void pay(Double amount) {
        System.out.println("Payment has been received, the value is: " + amount);
    }
}
