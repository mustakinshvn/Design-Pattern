package ProxyDP;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private List<String>restrictedsites;
    private RealInternet realInternet;

    public ProxyInternet(){
        realInternet = new RealInternet();
        restrictedsites= new ArrayList<>();
        restrictedsites.add("pornHub.com");
        restrictedsites.add("xhamster.com");
        restrictedsites.add("freesites.com");
    }
    
    public void connectTo(String serverHost){
        if (restrictedsites.contains(serverHost)) {
            System.out.println("Access denied for the server "+ serverHost);
        }
        else{
            realInternet.connectTo(serverHost);;
        }
    }

}
