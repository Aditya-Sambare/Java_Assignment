package day15_CoreJava_ExceptionHandling;
class DemoAssertion{
    void demoAssertion() {
        int age = 900;
        assert age <= 100 : "Invalid Age";
        System.out.println("The age is " + age);
    }
}
public class AssertionDemo {
    public static void main(String[] args) {
        DemoAssertion demoAssertion = new DemoAssertion();
        demoAssertion.demoAssertion();
    }
}
/*
output is
Exception in thread "main" java.lang.AssertionError: Invalid Age
	at day15_CoreJava_ExceptionHandling.DemoAssertion.demoAssertion(AssertionDemo.java:5)
	at day15_CoreJava_ExceptionHandling.AssertionDemo.main(AssertionDemo.java:12)

Process finished with exit code 1

 */