package day9_CoreJava_Polymorphism;
//
///**
// * 3)Practically prove, After changing the return type overloading happens or not?
// * ANS ==>changing the return type overloading happens.
// */
class Method_Overloading_Demo{
    public int add(int a ,int b){
       int sum = a + b;
       return sum;
    }
    public float add(float a , float b){
        float sum = a + b;
        return sum;
    }
}
public class Que2 {
    public static void main(String[] args) {
        int a = 2 , b = 4 ;
        float i = 12f , j = 11.5f;
        Method_Overloading_Demo method_overloading_demo = new Method_Overloading_Demo();
        System.out.println("sum is : "+method_overloading_demo.add(a,b));
        System.out.println("sum is : "+method_overloading_demo.add(i,j));
    }
}
///*
//
//output is
//sum is : 6
//sum is : 23.5
//
//Process finished with exit code 0
// */