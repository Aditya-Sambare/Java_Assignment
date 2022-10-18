/*
Question Link :
https://www.hackerrank.com/challenges/the-time-in-words/submissions
 */
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class Result4 {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        String[] time=new String[] {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        String result = null;
        if(m==00){
            result = time[h-1]+ " o' clock";
        }if(m==15){
            result="quarter past "+time[h-1];
        }if(m==30){
            result="half past "+time[h-1];
        }if (m<30 && m!=15 && m>1){
            result = time[m-1]+" minutes past "+time[h-1];
        }if (m==1){
            result = time[m-1]+" minute past "+time[h-1];
        }
        if(m==45){
            result="quarter to "+time[h];
        }if (m>30 && m!=45){
            int t = 60-m;
            result = time[t-1]+" minutes to "+time[h];
        }
        return result;
    }

}

public class Question4_TheTimeInWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result4.timeInWords(h, m);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
