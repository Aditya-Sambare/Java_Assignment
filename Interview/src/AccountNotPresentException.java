public class AccountNotPresentException extends Exception{
    public AccountNotPresentException(String message) {
        super(message);
    }
    public String getMessage(){
        String str = "Account not present \n please check account number";
        return str;
    }
}
