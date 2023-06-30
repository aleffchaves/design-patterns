package comportamentais.mediator;

public class ChatSystem {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        Participant user1 = new User("John", chatRoom);
        Participant user2 = new User("Lara", chatRoom);
        Participant user3 = new User("Thomas", chatRoom);

        chatRoom.addParticipant(user1);
        chatRoom.addParticipant(user2);
        chatRoom.addParticipant(user3);

        chatRoom.sendMessage("Hello guess!", user1);
        chatRoom.sendMessage("Hy", user2);
        chatRoom.sendMessage("whats", user3);
    }
}
