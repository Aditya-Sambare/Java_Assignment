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
        System.out.println("we can not override the static method");

    }
}
//====================================
//output is
//        java: method addition(int,int) is already defined in class Day5_CoreJava.Static_Demo1
//
