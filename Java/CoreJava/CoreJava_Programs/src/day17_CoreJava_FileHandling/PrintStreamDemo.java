package day17_CoreJava_FileHandling;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream("src/day17_CoreJava_FileHandling/PrintStreamDemo");
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        System.out.println("hello this is printstream demo");//with the help of above printstream this sout will not
        //print the data on console but will write it in the file
    }
}
