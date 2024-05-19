package ChainOfResponsibilityDp;

public class TwoFactorAuthentication implements AuthenticationHandler{

    AuthenticationHandler authenticationHandler;

    public void setNextHandler(AuthenticationHandler authenticationHandler){
        this.authenticationHandler=authenticationHandler;
    }
    
    @Override
    public boolean authenticate(String userName, String password){
        if(userName.equals("user123") && password.equals("12345") && VeryfyOTP("909090")){
            System.out.println("TwoFactorAuthetication: Successful");
            return true;
        }else if (authenticationHandler!=null) {
          return authenticationHandler.authenticate(userName, password);
        }else{
            System.out.println("TwoFactorAuthentication: Faild");
            return false;
        }
    }

    public boolean VeryfyOTP(String otp){
        return otp.equals("909090");
    }
}
