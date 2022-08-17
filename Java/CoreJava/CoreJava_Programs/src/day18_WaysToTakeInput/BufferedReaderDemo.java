package day18_WaysToTakeInput;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println("enter number and name");
        int number = Integer.parseInt(bf.readLine());
        String name = bf.readLine();
        System.out.println(name);
        System.out.println(number);
    }
}
