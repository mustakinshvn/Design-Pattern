package Mediator;

public class ConcreteUser extends User {

    public ConcreteUser(ChatMediator mediator, String name){
        super(mediator, name);
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " sends: " + msg);
        mediator.sendMessage(msg, this);

    }
   
    public void receiveMessage(String msg){
        System.out.println(this.name + " receives: "+ msg);
    }

    
}
