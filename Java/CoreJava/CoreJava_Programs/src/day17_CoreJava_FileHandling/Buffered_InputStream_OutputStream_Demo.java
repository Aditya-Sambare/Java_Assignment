package day17_CoreJava_FileHandling;

import java.io.*;

public class Buffered_InputStream_OutputStream_Demo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream =null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/day17_CoreJava_FileHandling/Buffered_inputstream_outputstream_demo.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "this is buffered input and output stream demo";
            byte [] bytes1 = str.getBytes();
            bufferedOutputStream.write(bytes1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileInputStream fileInputStream = new FileInputStream("src/day17_CoreJava_FileHandling/Buffered_inputstream_outputstream_demo.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        while(true){
            int i = bufferedInputStream.read();
            if(i == -1){
                break;
            }
            System.out.print((char)i);
        }
    }
}
