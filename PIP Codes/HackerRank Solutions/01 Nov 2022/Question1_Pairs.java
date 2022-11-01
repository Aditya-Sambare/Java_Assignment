import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
       int result = 0;
       /* Approach 1*/
//                Collections.sort(arr);
//        for (int i = arr.size()-1; i >=0 ; i--) {
//            for (int j = i-1; j >= 0 ; j--) {
//                if (arr.get(i)-arr.get(j) == k){
//                    result++;
//                }
//            }
//        }
        /* Approach 2*/
//        List<Object> list = arr.stream().filter(s->arr.contains(s+k)).collect(toList());
//        return list.size();
//
        /* Approach 3*/
//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.contains(arr.get(i)+k)){
//                result++;
//            }
//        }
        /* Approach 4*/
//        for(int a : arr){
//            if(arr.contains(a+k)){
//                result++;
//            }
//        }
        /* Approach 5*/
        Set<Integer> set = new HashSet<>();
        set.addAll(arr);
        for(int a : set){
            if(set.contains(a+k)){
                result++;
            }
        }
return result;
    }
}
public class Question1_Pairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result1.pairs(k, arr);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
    }

