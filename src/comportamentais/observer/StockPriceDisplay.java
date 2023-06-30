package comportamentais.observer;

public class StockPriceDisplay implements StockObserver {

    @Override
    public void update(final Stock stock) {
        System.out.println("Stock price update: " + stock.getSymbol() + " - $" + stock.getPrice());
    }
}
