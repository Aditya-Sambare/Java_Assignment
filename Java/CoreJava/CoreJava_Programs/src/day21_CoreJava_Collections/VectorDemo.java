package day21_CoreJava_Collections;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
//interface A
//{
//
//    void show(int a);
//}
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(1);
        vector.addElement(6);
        vector.addElement(5);
        vector.addElement(9);
        vector.addElement(7);
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
//   A a=(a1)-> System.out.println("Hello anuj sundriyal");
//   a.show(10);
    }
}
