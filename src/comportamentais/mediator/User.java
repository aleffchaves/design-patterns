package comportamentais.mediator;

public class User implements Participant {
    private String username;
    private ChatMediator chatMediator;

    public User(final String username, final ChatMediator chatMediator) {
        this.username = username;
        this.chatMediator = chatMediator;
    }

    @Override
    public void sendMessage(final String message) {
        this.chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(final String message) {
        System.out.println(username + " Received message: "+ message);
    }
}
