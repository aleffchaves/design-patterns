package comportamentais.observer;

public class StockSystem {

    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", 150.0);

        StockObserver observer1 = new StockPriceDisplay();
        StockObserver observer2 = new StockPriceDisplay();
        StockObserver observer3 = new StockPriceDisplay();

        stock.attach(observer1);
        stock.attach(observer2);
        stock.attach(observer3);

        stock.setPrice(155.0); // Notifica os observadores sobre a mudança de preço

        stock.detach(observer2);

        stock.setPrice(160.0); // Apenas o observer1 será notificado
    }
}
