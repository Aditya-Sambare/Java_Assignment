package day15_CoreJava_ExceptionHandling;
class Demo_Exception{
    public void divide(){
        try {
            int a = 16 , b = 0;
            float div = a / b;
            System.out.println("div is : "+div);
        } catch (Exception e) {
            System.out.println(e);;
        }

    }
}
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Demo_Exception demo_exception = new Demo_Exception();
        demo_exception.divide();
    }
}
