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
        char characterInString = s.charAt(0);
        stringWeightList.add(characterInString-96);
        int count = 1;
        for(int  i=1;i <s.length() ;i++){
            char currentChar = s.charAt(i);
            if(currentChar==characterInString){
                count++;
                stringWeightList.add((currentChar-96)*count);
            }
            else{
                count = 1 ;
                characterInString = currentChar;
                stringWeightList.add((currentChar-96)*count);
            }
        }
        System.out.println(stringWeightList);
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
        System.out.println(result);
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

