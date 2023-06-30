package comportamentais.memento;

//Originator classe que representa umm pagamento
public class Payment {
    private String orderId;
    private double amount;

    public Payment(final String orderId, final double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    //método que cria um novo memento
    public PaymentMemento createMemento() {
        return new PaymentMemento(orderId, amount);
    }

    //método para restaurar o estado do pagamento a partir de um memento
    public void restoreMemento(final PaymentMemento memento) {
        this.orderId = memento.getOrderId();
        this.amount = memento.getAmount();
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
