package day9_CoreJava;
/**
 * 4)Practically prove, After changing the return type, overriding happens/or not?
 * ANS==>if we keep the return type among the primitive data type then the method overriding will not happen
 * but if we keep the return type as the class name then the method overriding is possible
 * that is called as Covariant return type
 */
//class Method_Overriding_Demo{
//    public void addition1(){
//        int a = 1 , b = 2;
//        int sum = a+b;
//        System.out.println("sum is : "+sum);
//    }
//
//}
//class Method_Overriding_Demo1 extends Method_Overriding_Demo{
//    public int addition1(){
//        int a = 10 , b = 20;
//        int sum = a+b;
//        return sum;
//    }
//}
//public class Que3 {
//    public static void main(String[] args) {
//        Method_Overriding_Demo method_overriding_demo = new Method_Overriding_Demo();
//        method_overriding_demo.addition1();
//        Method_Overriding_Demo1 method_overriding_demo1 = new Method_Overriding_Demo1();
//        method_overriding_demo1.addition1();
//    }
//}
