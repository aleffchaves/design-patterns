package estruturais.facade.paymentsexemple;


// Classe de fachada para o sistema de pagamentos
//public class PaymentFacade {
//    private PayPalService payPalService;
//    private StripeService stripeService;
//    private MercadoPagoService mercadoPagoService;
//
//    public PaymentFacade() {
//        payPalService = new PayPalService();
//        stripeService = new StripeService();
//        mercadoPagoService = new MercadoPagoService();
//    }
//
//    public void processPayment(PaymentInfo paymentInfo, PaymentProvider provider) {
//        switch (provider) {
//            case PAYPAL:
//                payPalService.initialize();
//                payPalService.authenticate(paymentInfo.getToken());
//                payPalService.processPayment(paymentInfo.getAmount());
//                payPalService.close();
//                break;
//            case STRIPE:
//                stripeService.initialize();
//                stripeService.validateCredentials(paymentInfo.getApiKey());
//                stripeService.createCharge(paymentInfo.getAmount(), paymentInfo.getCardNumber());
//                stripeService.close();
//                break;
//            case MERCADOPAGO:
//                mercadoPagoService.initialize();
//                mercadoPagoService.authenticate(paymentInfo.getAccessToken());
//                mercadoPagoService.processPayment(paymentInfo.getAmount(), paymentInfo.getCustomerId());
//                mercadoPagoService.close();
//                break;
//            default:
//                throw new IllegalArgumentException("Payment provider not supported.");
//        }
//    }
//}
