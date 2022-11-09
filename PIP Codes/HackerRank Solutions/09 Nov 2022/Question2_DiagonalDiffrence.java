
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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int result = 0 ;
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 1; i <= arr.size() ; i++) {
            for (int j = 1; j <= arr.get(i-1).size() ; j++) {
                if (i==j){
                    firstDiagonalSum += arr.get(i-1).get(j-1);
                }
                if (i+j == arr.size()+1){
                    secondDiagonalSum += arr.get(i-1).get(j-1);
                }
            }
        }
        result =  firstDiagonalSum-secondDiagonalSum;
        return Math.abs(result);
    }

}
public class Question2_DiagonalDiffrence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result2.diagonalDifference(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
