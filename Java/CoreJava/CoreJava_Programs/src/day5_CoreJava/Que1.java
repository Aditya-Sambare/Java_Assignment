package day5_CoreJava;
public class Que1 {
    static class Static_Class{
        public void static_class_Method(){
            System.out.println("we are in a static class");
        }
    }
    static String str = "this is a static variable";
    static void static_Method_demo(){
        System.out.println("we are inside static method");
    }
    static{
        System.out.println("we are inside static block");
    }
    public static void main(String[] args) {
        static_Method_demo();
        System.out.println(str);
        Static_Class static_class = new Static_Class();
        static_class.static_class_Method();
    }
}
//-----------------------------------------------------------
//output is
//        we are inside static block
//        we are inside static method
//        this is a static variable
//        we are in a static class
//
//Process finished with exit code 0
