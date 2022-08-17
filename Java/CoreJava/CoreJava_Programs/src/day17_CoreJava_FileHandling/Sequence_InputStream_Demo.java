package day17_CoreJava_FileHandling;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

//there is only sequence input stream but no sequence output stream
//and the constructor of the sequence stream can only have two file inputstream object
//so to read more than two files you have to use enumaration. you can pass the enumaration in the constructor by using it you read as many file you want
public class Sequence_InputStream_Demo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream1 = new FileInputStream("src/day17_CoreJava_FileHandling/File1.txt");
            FileInputStream fileInputStream2= new FileInputStream("src/day17_CoreJava_FileHandling/File2.txt");
            FileInputStream fileInputStream3 = new FileInputStream("src/day17_CoreJava_FileHandling/File3.txt");
            FileInputStream fileInputStream4 = new FileInputStream("src/day17_CoreJava_FileHandling/File4.txt");
            //SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);
//            while(true){
//                int i = sequenceInputStream.read();
//                if(i == -1){
//                    break;
//                }
//                System.out.print((char) i);
//            }
            Vector v = new Vector<>();
            v.addElement(fileInputStream1);
            v.addElement(fileInputStream2);
            v.addElement(fileInputStream3);
            v.addElement(fileInputStream4);
            Enumeration enumeration = v.elements();
            SequenceInputStream sequenceInputStream1 = new SequenceInputStream(enumeration);
            FileOutputStream fileOutputStream = new FileOutputStream("src/day17_CoreJava_FileHandling/WriteFromAllFile.txt");
            while(true){
                int i = sequenceInputStream1.read();
                if(i == -1){
                    break;
                }
                System.out.print((char) i);
                fileOutputStream.write(i);// by writing this line we have write all the data from all files into a single file
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
