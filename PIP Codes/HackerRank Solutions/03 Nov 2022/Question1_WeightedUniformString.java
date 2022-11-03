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
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
List<String> resultList = new ArrayList<>();
List<Integer> stringWeightList = new ArrayList<>();
char characterInString = 0;
        for (int i = 0; i < s.length(); i++) {
            stringWeightList.add(i,s.charAt(i)-96);
            if (s.charAt(i)==characterInString){
                stringWeightList.add(i,stringWeightList.get(i-1)+(s.charAt(i)-96));
            }
            characterInString = s.charAt(i);
        }
        for (Integer i : queries){
            if (stringWeightList.contains(i)){
                resultList.add("Yes");
            }else{
                resultList.add("No");
            }
        }
return resultList;
    }
}
public class Question1_WeightedUniformString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> result = Result1.weightedUniformStrings(s, queries);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

