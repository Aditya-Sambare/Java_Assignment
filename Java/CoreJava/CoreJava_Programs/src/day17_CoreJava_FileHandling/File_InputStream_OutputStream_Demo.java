package day17_CoreJava_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_InputStream_OutputStream_Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/day17_CoreJava_FileHandling/File_inputstream_outputstream_demo",true);
        //in above line if we pass true then it will append the data in that file and if you dont pass any thing then it is by default false
        // and it will override the data in the fill if the file is already present and if not it will create the file .
        String str = "This is File InputStream and File OutputStream demo";
        byte[] bytes1 = str.getBytes();
        fileOutputStream.write(bytes1);//write the data of the bytes1 array into file
//        for (int i = 0; i < bytes1.length; i++) {
//            fileOutputStream.write(bytes1[i]);//write method of FileOutputStream to write in the file
//        }
        FileInputStream fileInputStream = new FileInputStream("src/day17_CoreJava_FileHandling/File_inputstream_outputstream_demo");
        while(true){
            int i = fileInputStream.read();//read method of FileInputStream to read from the file
            if (i == -1){
                break;
            }
            System.out.print((char)i);
    }
    }
}
