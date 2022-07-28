package day5_CoreJava;
class Static_Demo{
    //static method
    public static void print_Data()
    {
        System.out.println("this is a static method");
    }
    //overloaded static method
    public static void print_Data(int a)
    {
        System.out.println("this is a overloaded static method");
    }
}
public class Que3_1 {
        public static void main(String args[]) {
            Static_Demo.print_Data();
            Static_Demo.print_Data(18);
        }
}
//-----------------------------------------------------------------------------
//output is
//        this is a static method
//        this is a overloaded static method
//
//        Process finished with exit code 0


