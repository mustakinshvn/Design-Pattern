package ChainOfResponsibilityDp;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler h1= new UserAuthentication();
        AuthenticationHandler h2= new TwoFactorAuthentication();
        AuthenticationHandler h3= new IpHandler();

        h3.setNextHandler(h1);
        h1.setNextHandler(h2);

        boolean isAuthenticate = h3.authenticate ("user123", "12345");

        if (isAuthenticate) {
            System.out.println("Authenticaion is successfull.");
        }else{
            System.out.println("Authentication is faild.");
        }
    }
}
