package estruturais.composite.paymentexemple;

public class SimpleTransaction implements Transaction {

    private final double amount;

    SimpleTransaction(final double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateTotal() {
        return amount;
    }

    @Override
    public void showDetails() {
        System.out.println("Transaction total: " + amount);
    }

    @Override
    public String toString() {
        return "SimpleTransaction{" +
                "amount=" + amount +
                '}';
    }
}
