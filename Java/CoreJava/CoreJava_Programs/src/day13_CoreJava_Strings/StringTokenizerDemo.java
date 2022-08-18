package day13_CoreJava_Strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("hello my name is aditya");
        StringTokenizer stringTokenizer1 = new StringTokenizer("hello..my.name ..is.. aditya","..");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        while(stringTokenizer1.hasMoreTokens()){
            System.out.println(stringTokenizer1.nextToken());
        }
    }
}
