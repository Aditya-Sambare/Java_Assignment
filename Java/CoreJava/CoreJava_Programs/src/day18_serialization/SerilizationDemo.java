package day18_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
    public static void main(String[] args) throws IOException {
        Employee obj_e = new Employee(121,"aditya",45000);
        FileOutputStream out = new FileOutputStream("src/day18_serialization/serializationdemo.txt");
        ObjectOutputStream obj_o = new ObjectOutputStream(out);
        obj_o.writeObject(obj_e);
        System.out.println("Serialization done");
    }
}
