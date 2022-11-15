
import java.io.*;
        import java.math.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        // Write your code here
        BigInteger number1 = BigInteger.valueOf(t1);
        BigInteger number2 = BigInteger.valueOf(t2);
        BigInteger number3 = BigInteger.valueOf(0);
        for (int i = 0; i < n-2; i++) {
            number3 = number1.add(number2.multiply(number2));
            number1 = number2;
            number2 = number3;
        }

return number3;
    }

}

public class Question1_FibonacciModified {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t1 = Integer.parseInt(firstMultipleInput[0]);

        int t2 = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = Result1.fibonacciModified(t1, t2, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
  //      bufferedWriter.newLine();

        bufferedReader.close();
  //      bufferedWriter.close();
    }
}
