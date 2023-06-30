package comportamentais.memento;

import java.util.Stack;

//Caretaker - Classe responsável por armazenar e restaurar o estado de um pagamento
public class PaymentHistory {
    private Stack<PaymentMemento> mementos = new Stack<>();

    //Add um memento a pilha
    public void addMemento(final PaymentMemento memento) {
        this.mementos.add(memento);
    }

    //Metodo para recuperar o ultimo memento
    public PaymentMemento getLastMemento() {
        return this.mementos.peek();
    }

    //Método para remover e recuperar o ultimo memento da pilha
    public PaymentMemento undo() {
        return this.mementos.pop();
    }
}
