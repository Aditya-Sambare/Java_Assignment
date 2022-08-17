class TestClass1 {
    void exceptionDemo1() {
        try {
            try {
                Object obj = new Object();
                //class cast exception here
                Integer integer = (Integer) obj;

            } finally{
                System.out.println("exception occoured");
            }
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}
class TestClass {
    void exceptionDemo() {
        String name = null;
        try {
            try {
                Object obj = new Object();
                //class cast exception here
                Integer integer = (Integer) obj;

            }catch (ClassCastException e) {
                e.printStackTrace();
            }
            //null pointer exception here
            name.length();
        } catch (NullPointerException e) {
                e.printStackTrace();
            }
    }
}
public class Class_Test3 {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.exceptionDemo();
        TestClass1 testClass1 = new TestClass1();
        testClass1.exceptionDemo1();
    }
}
