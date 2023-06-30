package comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject (Sujeito concreto) - Implementação concreta do sujeito
public class Stock implements StockSubject {
    private String symbol;
    private double price;
    private List<StockObserver> observers;


    public Stock(final String symbol, final double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setPrice(final double price) {
        this.price = price;
        this.notifyObservers();
    }

    @Override
    public void attach(final StockObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(final StockObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (final var observer : this.observers) {
            observer.update(this);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }
}