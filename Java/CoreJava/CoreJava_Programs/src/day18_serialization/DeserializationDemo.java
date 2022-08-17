package day18_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("src/day18_serialization/serializationdemo.txt"));
        Employee obj_e = (Employee) obj.readObject();
        System.out.println("deserialization done");
        System.out.println("Employee id :"+obj_e.eid+"employee name  :"+obj_e.ename+" employee salary is : "+obj_e.esal);

    }
}
