package day17_CoreJava_FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_FileReader_Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("fileWriter_and_fileReader_Demo.txt");
        fileWriter.write("this is demo of file writer and file reader");
        fileWriter.close();

        FileReader fileReader = new FileReader("fileWriter_and_fileReader_Demo.txt");
        while(true){
            int c = fileReader.read();
            if(c == -1){
                break;
            }
            System.out.print((char)c);

        }
    }
}
