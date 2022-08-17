package day17_CoreJava_FileHandling;

import java.io.*;

public class Data_InputStream_OutputStream_Demo {
    public static void main(String[] args) throws IOException {
        String str = "this is a string";
        FileOutputStream fileOutputStream = new FileOutputStream("File1.txt",true);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeBytes("this is demo of data input and output stream");
        dataOutputStream.write(121);
        dataOutputStream.write(str.getBytes());
        dataOutputStream.writeFloat(100.0f);
        FileInputStream fileInputStream = new FileInputStream("File1.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        FileInputStream fileInputStream1 = new FileInputStream("File2.txt");
        DataInputStream dataInputStream1 = new DataInputStream(fileInputStream1);
        //byte a[] = new byte[fileInputStream.available()];

        String i = dataInputStream.readLine();
        System.out.println(i);
//        for(int i=0;i<a.length;i++)
//            System.out.print((char)a[i]);
     }
}
