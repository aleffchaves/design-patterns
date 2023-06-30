package comportamentais.chainofresponsability.paymentexemple;

public class Client {
    public static void main(String[] args) {

        PaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor();
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentProcessor bankTransferProcessor = new BankTransferPaymentProcessor();

        payPalPaymentProcessor.processPayment(1000.0);
        payPalPaymentProcessor.executeNext(creditCardProcessor);
        creditCardProcessor.executeNext(bankTransferProcessor);

        payPalPaymentProcessor.processPayment(900.0); // Processado pelo cartão de crédito
        payPalPaymentProcessor.processPayment(40000.0); // Processado por transferência bancária
        payPalPaymentProcessor.processPayment(90.0); // Processado via PayPal
    }
}
