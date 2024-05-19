package ChainOfResponsibilityDp;

public class UserAuthentication implements AuthenticationHandler {

    AuthenticationHandler authenticationHandler;

    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler= authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
       if (userName.equals("mustakinshvn") && password.equals(12345)) {
        System.out.println("UserAuthenticationHandler: Authentication is successfull");
        return true;
       } else if (authenticationHandler!=null) {
              return authenticationHandler.authenticate(userName, password);
              
       }else{
             System.out.println("UserAuthentication: Authentication is failed");
             return false;
       }
        
    }

   

     



}
