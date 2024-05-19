package ChainOfResponsibilityDp;

public class IpHandler implements AuthenticationHandler {
    AuthenticationHandler authenticationHandler;

    public void setNextHandler(AuthenticationHandler authenticationHandler){
        this.authenticationHandler=authenticationHandler;
    }

   String ClientIp = getClientIp();
   
    public boolean authenticate(String userName, String password){
        if(!ClientIp.contains("192.168.1")){
            System.out.println("IP Authentication: Faild");
            return false;
        }else if (authenticationHandler!=null) {
            System.out.println("IP Authentication: Successfull");
            return authenticationHandler.authenticate(userName, password);
        }else{
            System.out.println("IPAuthentication: Failed");
            return false;
        }
    }

    public String getClientIp(){
        return "192.168.1";
    }
    
}
