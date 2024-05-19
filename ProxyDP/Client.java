package ProxyDP;

public class Client {
    public static void main(String[] args) {
        Internet i = new ProxyInternet();
        i.connectTo("google.com");
        i.connectTo("facebook.com");
        i.connectTo("xhamster.com");
    }
}
