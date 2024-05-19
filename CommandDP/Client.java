package CommandDP;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOffCommand off = new LightOffCommand(light);
        LightOnCommand on = new LightOnCommand(light);
        RemoteControl rc= new RemoteControl();

        rc.setCommand(on);
        rc.pressButton();

        rc.setCommand(off);
        rc.pressButton();
    }
    
}
