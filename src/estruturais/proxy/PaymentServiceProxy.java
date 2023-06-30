package estruturais.proxy;

public class PaymentServiceProxy implements PaymentService {
    private PaymentService paymentService;

    @Override
    public void pay(Double amount) {

        if (paymentService == null) {
            paymentService = new PaymentServiceImpl();
            System.out.println("Fui criado depois");
        }

        System.out.println("Starting transaction...");
        paymentService.pay(amount);
        System.out.println("Finished transaction...");
    }
}
