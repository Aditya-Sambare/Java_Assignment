package day11_CoreJava_Constructor_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  Q2)Try all methods of "Class" For variables,methods,constructor,class.
 */
class Class_Demo{
    public int a = 10;
    public String str = "adsfghj";
    private int panNo = 1100220022;

    public Class_Demo(int a, String str, int panNo) {
        this.a = a;
        this.str = str;
        this.panNo = panNo;
    }

    public Class_Demo(int a, String str) {
        this.a = a;
        this.str = str;

    }

    class Demo1{
        void display(){
            System.out.println("hi");
        }
    }

    @Override
    public String toString() {
        return "Class_Demo{" +
                "a=" + a +
                ", str='" + str + '\'' +
                ", panNo=" + panNo +
                '}';
    }
}
public class Que2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //Class_Demo class_demo = new Class_Demo();
        //Class c = Class.forName(String c)
        Class c = Class.forName("day11_CoreJava_Constructor_Reflection.Class_Demo");
        System.out.println("-------------------------------class-------------------------------------");
        System.out.println(c.getName()); //method to get class name
        System.out.println(c.getSuperclass()); //method to get super class
        System.out.println("---------------------------------package-----------------------------------");
        System.out.println(c.getPackage()); // method to get package
        System.out.println("--------------------------------fields-------------------------------------");
        Field [] fields = c.getFields(); // method to get fields
        for(Field f :fields) {
            System.out.println("fields are "+f);
        }
        Field field = c.getDeclaredField("panNo"); //method to get private fields
        System.out.println(field);
        System.out.println("--------------------------------------methods----------------------------------");
        Method[] methods= c.getMethods(); //method to get methods
        for(Method m:methods) {
            System.out.println(m);
        }
        System.out.println("----------------------------constructor-------------------------------------------");
        System.out.println(c.getConstructors());//method to get constructors
    }
}

