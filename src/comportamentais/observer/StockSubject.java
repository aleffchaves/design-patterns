package comportamentais.observer;

// Subject (sujeito) - Interface que define os métodos para adicionar, remover e notificar os observadores
public interface StockSubject {
    void attach(final StockObserver observer);
    void detach(final StockObserver observer);
    void notifyObservers();
}
