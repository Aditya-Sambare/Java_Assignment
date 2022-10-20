/*
https://www.hackerrank.com/challenges/bomber-man/problem
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
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        char [][]tempArray3 = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < tempArray3.length; i++) {
            for (int j = 0; j < tempArray3[0].length; j++) {
                tempArray3[i][j]='O';
            }}
        List<String> grid3 = new ArrayList<>();
        for (int i = 0; i < tempArray3.length; i++) {
            String str = String. valueOf(tempArray3[i]);
            grid3.add(str);
        }

        char [][]tempArray = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[0].length; j++) {
                tempArray[i][j]=grid.get(i).charAt(j);
            }
        }
        char [][]tempArray1 = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < tempArray1.length; i++) {
            for (int j = 0; j < tempArray1[0].length; j++) {
                tempArray1[i][j]='O';
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                if(tempArray[i][j]=='O') {
                    tempArray1[i][j] = '.';
                    if (i > 0) {
                        tempArray1[i - 1][j] = '.';
                    }
                    if (i < tempArray1.length - 1){
                        tempArray1[i + 1][j] = '.';
                    }
                    if (j>0){
                        tempArray1[i][j-1]='.';
                    }
                    if(j<tempArray1[i].length-1) {
                        tempArray1[i][j + 1] = '.';
                    }
                }
            }
        }
        List<String> grid1 = new ArrayList<>();
        for (int i = 0; i < tempArray1.length; i++) {
            String str = String. valueOf(tempArray1[i]);
            grid1.add(str);
        }

        char [][]tempArray2 = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < tempArray2.length; i++) {
            for (int j = 0; j < tempArray2[0].length; j++) {
                tempArray2[i][j]='O';
            }
        }
        for (int i = 0; i < tempArray1.length; i++) {
            for (int j = 0; j < tempArray1[0].length; j++) {
                if(tempArray1[i][j]=='O') {
                    tempArray2[i][j] = '.';
                    if (i > 0) {
                        tempArray2[i - 1][j] = '.';
                    }
                    if (i < tempArray2.length - 1){
                        tempArray2[i + 1][j] = '.';
                    }
                    if (j>0){
                        tempArray2[i][j-1]='.';
                    }
                    if(j<tempArray2[i].length-1) {
                        tempArray2[i][j + 1] = '.';
                    }
                }
            }
        }
        List<String> grid2 = new ArrayList<>();
        for (int i = 0; i < tempArray2.length; i++) {
            String str = String.valueOf(tempArray2[i]);
            grid2.add(str);
        }
        if (n%2==0){
            return grid3;
        }
        int r1 = 3;
        while(n<=r1){
            if (n==r1){
                return grid1;
            }
            r1=r1+4;
        }
        int r2 = 5;
        while(n<=r2){
            if (n==r2){
                return grid2;
            }
            r2=r2+4;
        }
        if(n==1){
            return grid;}
        return grid;
    }

}

public class Question2_Bomberman {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result2.bomberMan(n, grid);
        System.out.println(result);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
