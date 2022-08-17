package day17_CoreJava_FileHandling;

import java.io.*;

public class CharArrayWriter_CharArrayReader_Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("CharArrayReader_And_CharArrayWriter_Demo1.txt");
        FileWriter fileWriter2 = new FileWriter("CharArrayReader_And_CharArrayWriter_Demo2.txt");
        FileWriter fileWriter3 = new FileWriter("CharArrayReader_And_CharArrayWriter_Demo3.txt");
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("this demo of char array writer and char array reader");
        charArrayWriter.writeTo(fileWriter1);
        charArrayWriter.writeTo(fileWriter2);
        charArrayWriter.writeTo(fileWriter3);
        charArrayWriter.close();
        fileWriter1.close();
        fileWriter2.close();
        fileWriter3.close();
        FileReader fileReader1 = new FileReader("CharArrayReader_And_CharArrayWriter_Demo1.txt");
        FileReader fileReader2 = new FileReader("CharArrayReader_And_CharArrayWriter_Demo2.txt");
        FileReader fileReader3 = new FileReader("CharArrayReader_And_CharArrayWriter_Demo3.txt");
        //char ch[];
        CharArrayReader charArrayReader = new CharArrayReader("Anuj".toCharArray());
        while(true){
            int i = charArrayReader.read();
            if(i == -1){
                break;
            }
            System.out.print((char)i);
        }
    }
}
