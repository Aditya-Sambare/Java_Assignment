public class InsuffcientBalanceException extends Exception{
    public InsuffcientBalanceException(String message) {
        super(message);
    }
    public String getMessage(){
        String str = "Insuffient Balance";
        return str;
    }
}
