/*
Question Link :
https://www.hackerrank.com/challenges/encryption/problem
 */
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String encryption(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        s = s.replaceAll("\\s","");
        int length = s.length();
        double squareRoot = Math.sqrt(length);
        int noOfRows = (int)squareRoot;
        int noOfColumns = noOfRows+1;
        if (noOfColumns*noOfRows < length){
            noOfRows++;
        }
        for (int i = 2; i < 10; i++) {
            if (squareRoot==i){
                noOfColumns= (int) squareRoot;
                noOfRows= (int) squareRoot;
            }
        }
        char [][] result = new char[noOfRows][noOfColumns];
        List list = new ArrayList<>();
        int count = 0;
        for(int i = 0 ; i < noOfRows ; i++){
            for (int j = 0; j < noOfColumns; j++) {
                if (count<length){
                result[i][j]=s.charAt(count);
                count++;}
            }}
        for (char[] ch : result){
        }
            for(int j = 0; j < noOfColumns; j++){
                for (int i = 0 ; i < noOfRows ; i++) {
                    if (result[i][j] >= 65)
                    list.add(result[i][j]);
                }
                list.add(" ");
        }
            for (Object ch:list){
                sb.append(ch);
            }
            String results = sb.toString();
return results;
    }

}

public class Question1_Encryption {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result1.encryption(s);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
