/*
Question Link : https://www.hackerrank.com/challenges/candies/problem
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

class Result1 {

    /*
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        long countOfCandiesToBuy = 0;
        int previousCount = 1;
        int previousCount1 = 1;
        List<Integer> countList1 = new ArrayList<>();
        List<Integer> countList2 = new ArrayList<>(n);
        countList1.add(0,1);
        for (int i = 1; i < n ; i++) {
            if (arr.get(i-1)<arr.get(i)){
                countList1.add(i,previousCount+1);
                previousCount = countList1.get(i);
            }else{
                countList1.add(i,1);
                previousCount = 1;
            }
        }
        for (int i = 0; i < countList1.size(); i++) {
            countList2.add(1);
        }
        countList2.set(n-1,1);
        for (int i = arr.size()-2; i >= 0 ; i--) {
            if (arr.get(i+1)<arr.get(i)){
                countList2.set(i,previousCount1+1);
                previousCount1 = countList2.get(i);
            }else{
                countList2.set(i,1);
                previousCount1 = 1;
            }
        }
        for (int i = 0; i < countList1.size(); i++) {
            countOfCandiesToBuy += Math.max(countList1.get(i),countList2.get(i));
        }
        return countOfCandiesToBuy;
    }
}
public class Question1_Candies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result1.candies(n, arr);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

