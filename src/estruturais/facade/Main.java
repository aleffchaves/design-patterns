package estruturais.facade;
//
//public class Main {
//    public static void main(String[] args) {
//        PaymentFacade paymentFacade = new PaymentFacade();
//
//        // Processar pagamento usando PayPal
//        PaymentInfo paymentInfoPayPal = new PaymentInfo("123456789", 100.0);
//        paymentFacade.processPayment(paymentInfoPayPal, PaymentProvider.PAYPAL);
//
//        // Processar pagamento usando Stripe
//        PaymentInfo paymentInfoStripe = new PaymentInfo("987654321", 150.0);
//        paymentInfoStripe.setApiKey("your_stripe_api_key");
//        paymentFacade.processPayment(paymentInfoStripe, PaymentProvider.STRIPE);
//
//        // Processar pagamento usando Mercado Pago
//        PaymentInfo paymentInfoMercadoPago = new PaymentInfo("567890123", 200.0);
//        paymentInfoMercadoPago.setAccessToken("your_mercado_pago_access_token");
//        paymentFacade.processPayment(paymentInfoMercadoPago, PaymentProvider.MERCADOPAGO);
//    }
//}
