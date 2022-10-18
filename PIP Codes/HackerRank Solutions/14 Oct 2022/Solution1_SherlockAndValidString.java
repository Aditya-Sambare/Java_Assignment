
/*
Question Link
https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 */
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        String result = null;
        if(s.length()==1){
            return "YES";
        }
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hashMap.containsKey(s.charAt(i)))
            {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
            else {
                hashMap.put(s.charAt(i),1);
            }
        }
        List<Integer> integers=new ArrayList<>();
        for(Character stringIntegerEntry:hashMap.keySet())
        {

            integers.add(hashMap.get(stringIntegerEntry));
        }
        Collections.sort(integers);

        int max = integers.get(integers.size()-1);
        int secondMax = max-1;
        for(int i = 0 ; i < integers.size()-1; i++){
            if(integers.get(i)==secondMax){
                result="YES";
            }
            else{
                result = "NO";
            }
        }
        if(result.equals("NO")){
            for(int i = integers.size()-1 ; i >= 0  ; i--){
                if(integers.get(i)==max){
                    result="YES";
                }
                else{
                    result = "NO";
                }
            }


        }
        return result;
    }
}
public class Solution1_SherlockAndValidString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result1.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
