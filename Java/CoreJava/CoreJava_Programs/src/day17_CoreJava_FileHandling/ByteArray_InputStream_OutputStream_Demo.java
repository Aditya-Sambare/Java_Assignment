package day17_CoreJava_FileHandling;

import java.io.*;

public class ByteArray_InputStream_OutputStream_Demo {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("src/day17_CoreJava_FileHandling/ByteArray_inputstream_outputstream_demo.txt");
        String str = "this is ByteArray inputstream an outputstream demo";
        byte[] bytes1 = str.getBytes();
        byteArrayOutputStream.write(bytes1);
        byteArrayOutputStream.writeTo(fileOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes1);
        while(true){
            int i = byteArrayInputStream.read();
            System.out.print((char) i);


            if (i == -1){
                break;
            }
        }
    }
}
