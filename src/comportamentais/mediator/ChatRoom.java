package comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

//ConcreteMediator - Implementação concreta do mediator
public class ChatRoom implements ChatMediator {
    private List<Participant> participants;

    public ChatRoom() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void sendMessage(final String message, final Participant sender) {
        for (final var participant: participants) {
            if (participant != sender) {
                participant.receiveMessage(message);
            }
        }
    }

    @Override
    public void addParticipant(final Participant participant) {
        this.participants.add(participant);
    }
}
