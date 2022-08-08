package day15_CoreJava_ExceptionHandling;

/**
 * try to add Numeric data in String data type then handle this exception
 */
class Conversion{
    void conversion(){
        String str = "Aditya";
        int integer = Integer.parseInt(str);
        System.out.println(integer);

    }
    void conversion1(){
        try {
            String str = "Aditya";
            int integer = Integer.parseInt(str);
            System.out.println(integer);
        }catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Exception occored "+e.getMessage());
        }
    }
}
public class Que2_StringIntoInt {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        conversion.conversion1(); //we have handle the exception for this method
        conversion.conversion(); // but we have not handled the exception for this method but this will be get
        // handled by default exception handler
    }
}
/*
output is java.lang.NumberFormatException: For input string: "Aditya"
Exception occored For input string: "Aditya"
Exception in thread "main" java.lang.NumberFormatException: For input string: "Aditya"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at day15_CoreJava_ExceptionHandling.Conversion.conversion(Que2_StringIntoInt.java:5)
	at day15_CoreJava_ExceptionHandling.Que2_StringIntoInt.main(Que2_StringIntoInt.java:24)

 */