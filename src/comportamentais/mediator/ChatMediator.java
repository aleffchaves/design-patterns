package comportamentais.mediator;

//Interface que define os métodos de comunição
public interface ChatMediator {
    void sendMessage(final String message, final Participant participant);
    void addParticipant(final Participant participant);
}
