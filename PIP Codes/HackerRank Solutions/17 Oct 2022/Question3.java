/*
Question Link :
https://www.hackerrank.com/challenges/insertionsort1/problem
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

class Result3 {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int number = arr.get(n-1);
        for (int i = arr.size()-2; i >= 0; i--) {
                if (arr.get(i) > number) {
                    arr.set(i+1, arr.get(i));
                    printArray(arr);
            }if (arr.get(i) < number){
        arr.set(i+1, number);
                printArray(arr);
        break;
    }

        }
        if(number < arr.get(0)) {
            arr.set(0, number);
            printArray(arr);
        }}
        public static void printArray(List<Integer> arr){
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        }
public class Question3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result3.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
