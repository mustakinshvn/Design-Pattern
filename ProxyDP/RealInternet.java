package ProxyDP;

public class RealInternet implements Internet{
    public void connectTo(String serverHost){
        System.out.println("Connected to the server: "+serverHost);
    }
}
