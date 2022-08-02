package day11_CoreJava;

import java.lang.reflect.Field;

/**
 *  Q2)Try all methods of "Class" For variables,methods,constructor,class.
 */
class Class_Demo{
    int a = 10;
    class Demo1{
        void display(){
            System.out.println("hi");
        }
    }
}
public class Que2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //Class_Demo class_demo = new Class_Demo();
        //Class c = Class.forName(String c)
        Class c = Class.forName("day11_CoreJava.Class_Demo");
        Field F= c.getField();
        System.out.println(c.getName());
        System.out.println(c.getSuperclass());
        System.out.println(c.getPackage());
        System.out.println(F);
        }



    }
}
