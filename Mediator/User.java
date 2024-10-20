package Mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator , String name){
        this.mediator=mediator;
        this.name=name;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);
}
