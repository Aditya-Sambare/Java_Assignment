/*
Question Link :
https://www.hackerrank.com/challenges/the-grid-search/problem
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
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */

    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        String result = null;
        int index = 0 ;
        for (int i = 0; i < G.size(); i++) {
            if(G.get(i).contains(P.get(0))){
                for (int j = 1; j < P.size(); j++) {
                    if (P.get(0).equals(P.get(j))){
                        continue;
                    }else{
                        index = G.get(i+j).indexOf(P.get(j));
                    }
                }

                int p = 0;
                for (int j = i; j <= i+P.size()-1; j++) {
                    int index1 = G.get(j).indexOf(P.get(p));
                    if (G.get(j).contains(P.get(p)) && index1==index){
                        result ="YES";
                    }else {
                        result="NO";
                        break;
                    }
                    p++;
                }
                if (result.equals("YES")){
                    return result;
                }
            }

        }
        return result;
//        for (int i = 0; i <G.size() ; i++) {
//            for (int j = 0; j < G.get(i).length(); j++) {
//if(G.get(i).charAt(j)==P.get(0).charAt(0)){
//    result ="YES";
//    int p = i;
//    int n = j;
//    for (int k = 0; k < P.size(); k++) {
//        for (int l = 0; l < P.get(k).length(); l++) {
//            if (G.get(p).charAt(n)!=P.get(k).charAt(l)){
//                result = "NO";
//                n++;
//            }
//        }
//        p++;
//    }
//}else{
//    result="NO";
//}
//            }
//        }
    }

}
public class Question1_TheGridSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int R = Integer.parseInt(firstMultipleInput[0]);

                int C = Integer.parseInt(firstMultipleInput[1]);

                List<String> G = IntStream.range(0, R).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int r = Integer.parseInt(secondMultipleInput[0]);

                int c = Integer.parseInt(secondMultipleInput[1]);

                List<String> P = IntStream.range(0, r).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = Result1.gridSearch(G, P);
                System.out.println(result);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
