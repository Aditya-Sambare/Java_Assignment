package Day5_CoreJava;
class Static_Demo1 {
    //static method
    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
class Static_Demo2 extends Static_Demo1 {
    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
    public class Que3_2 {
    public static void main(String[] args) {
//
        System.out.println("we can not override the static method because we call static method by class name and if we call the method by class name overriding is not possible.");

    }
}

