package day16_CoreJava_ExceptionHandling;

public class InsufficientBalanceException extends  Exception {
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }

    public InsufficientBalanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientBalanceException(Throwable cause) {
        super(cause);
    }
    public String getMessage(){
        String str = "You dont have sufficient Balance";
        return str;
    }
}
