package day11_CoreJava_Constructor_Reflection;
import java.lang.reflect.Method;
/**
 * Q4)Try to access the parameterized method of the class
 */
class Information{
    private void displayName(String name){
        System.out.println("Name is :: " + name);
    }
}
public class Que4 {
    public static void main(String[] args)throws Exception {
        Information information = new Information();
        Class name = Class.forName("day11_CoreJava_Constructor_Reflection.Information");
        Method method = name.getDeclaredMethod("displayName",new Class[]{String.class});
        method.setAccessible(true);
        method.invoke(information,"Aditya");
        System.out.println(method);
    }
}
