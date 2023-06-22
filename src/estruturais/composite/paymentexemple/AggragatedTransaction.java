package estruturais.composite.paymentexemple;

import java.util.ArrayList;
import java.util.List;

public class AggragatedTransaction implements Transaction {
    List<Transaction> transaction = new ArrayList<>();


    public void AddTransaction(final Transaction transaction) {
        this.transaction.add(transaction);
    }

    public void removeTransaction(final Transaction transaction) {
        this.transaction.remove(transaction);
    }

    @Override
    public double calculateTotal() {
        return transaction.stream()
                .map(Transaction::calculateTotal)
                .reduce(0.0, Double::sum);
    }

    @Override
    public void showDetails() {
        System.out.println("Aggregated transaction details: " + transaction);
    }

}
