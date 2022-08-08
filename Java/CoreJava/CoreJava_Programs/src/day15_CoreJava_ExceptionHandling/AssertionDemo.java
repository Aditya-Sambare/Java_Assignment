package day15_CoreJava_ExceptionHandling;
class DemoAssertion{
    void demoAssertion() {
        int age = 90;
        assert age >= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
public class AssertionDemo {
    public static void main(String[] args) {
        DemoAssertion demoAssertion = new DemoAssertion();
        demoAssertion.demoAssertion();
    }
}
