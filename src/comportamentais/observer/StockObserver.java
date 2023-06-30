package comportamentais.observer;

//Interface (observador) - Interface que define o método de atualização
public interface StockObserver {
    void update(final Stock subject);
}
