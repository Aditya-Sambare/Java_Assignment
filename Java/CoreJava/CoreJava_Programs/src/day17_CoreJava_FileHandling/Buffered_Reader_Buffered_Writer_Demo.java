package day17_CoreJava_FileHandling;

import java.io.*;

public class Buffered_Reader_Buffered_Writer_Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("BufferedWriter_And_BufferedReader_Demo.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("this is buffered reader and writer demo");
//        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
        FileReader fileReader = new FileReader("BufferedWriter_And_BufferedReader_Demo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while(true){
            int i = bufferedReader.read();
            if(i == -1){
                break;
            }
            System.out.print((char)i);
        }
    }
}
