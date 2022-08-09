package day16_CoreJava_ExceptionHandling;
class Demo_Exception1{
    public void divide1(){
        try {
            int a = 16 , b = 0;
            float div = a / b;

            System.out.println("div is : "+div);
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
public class ExceptionHandlinDemo1 {
    public static void main(String[] args) {
        Demo_Exception1 demo_exception = new Demo_Exception1();
        demo_exception.divide1();
    }
}
