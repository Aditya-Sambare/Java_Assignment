package day15_CoreJava_ExceptionHandling;

/**
 *   Write a code for "ClassCastException" and handle it using Exception handling
 *   Mechanism.
 *   >try,catch,finally
 */
class ExceptionDemo{
    void demo(){
        try {
            Object obj = new Object();
            Integer integer = (Integer) obj;
            System.out.println("we have converted object of Object class into integer");
        }catch (ClassCastException e){
            System.out.println("Exception occoured "+e);
        }
        catch(Exception ex){
            System.out.println("exception occoured "+ex);
        }
        finally {
            System.out.println("this is finally block which will get executed in any case...");
        }
    }
}
public class Que1_ClassCastException {
    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.demo();
        }
    }
/*output is ---
Exception occoured java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Integer
this is finally block which will get executed in any case...

Process finished with exit code 0
*/