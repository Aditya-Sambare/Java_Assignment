/*
https://www.hackerrank.com/challenges/minimum-loss/problem
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

class Result2 {

    /*
     * Complete the 'minimumLoss' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER_ARRAY price as parameter.
     */

    public static int minimumLoss(List<Long> price) {
        // Write your code here
        int minLoss = 1000000000;
        for (int i = 0; i < price.size()-1; i++) {
            for (int j = i+1; j < price.size() ; j++) {
                int diffrence = (int) (price.get(i)-price.get(j));
                if(diffrence < minLoss && diffrence > 0){
                    minLoss = diffrence;
                }
            }
        }
        return minLoss;
    }
}
public class Question2_MinimumLoss {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> price = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        int result = Result2.minimumLoss(price);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();

    }
}

