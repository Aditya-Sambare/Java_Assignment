package day10_August_01_Assignment;
public class Lecture1_WraperClass {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a+" "+b);

//        final int bonus = 2;
//        bonus = 3;

        final Demo aditya = new Demo("Aditya Sambare");
        aditya.name = "other name";
        // when num1 non primitive is final, you cannot reassign it.
//        aditya = new Demo("new object");
        Demo obj = new Demo("Arjun");

        System.out.println( obj);

        for (int i = 0; i < 1000000000; i++) {
            obj = new Demo("new name");
        }
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class Demo {
    final int num = 10;
    String name;
    public Demo(String name) {
        System.out.println("object created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
