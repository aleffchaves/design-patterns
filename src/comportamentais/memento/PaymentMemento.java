package comportamentais.memento;

//Classe que representa um memento de um Pagamento
public class PaymentMemento {
    private String orderId;
    private double amount;

    PaymentMemento(final String orderId, final double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
