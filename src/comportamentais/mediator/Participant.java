package comportamentais.mediator;

public interface Participant {
    void sendMessage(final String message);
    void receiveMessage(final String message);
}
