package day16_CoreJava_ExceptionHandling;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
    }

    public InvalidAmountException(String message) {
        super(message);
    }

    public InvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAmountException(Throwable cause) {
        super(cause);
    }
    public String getMessage(){
        String str ="you have entered wrong amount";
        return str;
    }
}
