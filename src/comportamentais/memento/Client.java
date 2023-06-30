package comportamentais.memento;

public class Client {
    public static void main(String[] args) {

        Payment payment = new Payment("1002", 100.0);
        Payment payment2 = new Payment("1030", 197.0);
        Payment payment3 = new Payment("092", 160.0);

        PaymentHistory paymentHistory = new PaymentHistory();



        paymentHistory.addMemento(payment3.createMemento());
        paymentHistory.addMemento(payment2.createMemento());

        //Add um memento ao pagamento
        paymentHistory.addMemento(payment.createMemento());
        payment.setAmount(34.0);

        // Desfaz a última transação e restaura o estado anterior do pagamento
        PaymentMemento lastMemento = paymentHistory.undo();

        PaymentMemento especificMemento = paymentHistory.getLastMemento();
        payment.restoreMemento(lastMemento);

        System.out.println("Valor do pagamento: " + payment.getAmount()); // Valor do pagamento: 100.0
    }
}
