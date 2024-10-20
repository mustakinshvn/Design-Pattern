package Mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatRoom = new Chatroom();
        User alice = new ConcreteUser(chatRoom, "Alice");
        User bob = new ConcreteUser(chatRoom, "Bob");
        User charlie = new ConcreteUser(chatRoom, "Charlie");
        chatRoom.addUser(charlie);
        chatRoom.addUser(bob);
        chatRoom.addUser(alice);

        alice.sendMessage("Hello Motherfucker");
        bob.sendMessage("You son of a bitch");
    }
}
