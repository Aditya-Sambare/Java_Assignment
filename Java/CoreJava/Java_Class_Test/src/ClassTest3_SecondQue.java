class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidNameException extends  Exception{
    public InvalidNameException(String message) {
        super(message);
        System.out.println(message);
    }
}
class Check{
    void checkNameAndAge() throws InvalidNameException {
        String name ="Aditay27";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>=65 && name.charAt(i)<=90 || name.charAt(i)>=97 && name.charAt(i)<= 122) {
                throw new InvalidNameException("this is invalid name");
            }
        }
}
}
public class ClassTest3_SecondQue {
    public static void main(String[] args) throws InvalidNameException {
        Check check = new Check();
        check.checkNameAndAge();
    }
}
