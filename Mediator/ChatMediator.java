package Mediator;

public interface ChatMediator {
    void sendMessage(String msg, User User);  
    void addUser(User user);
}
