package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements ChatMediator {

    private List<User>users = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String msg, User user ){
      for(User u : this.users){
        if(u!=user){
            u.receiveMessage(msg);
        }
      }
    }
}
