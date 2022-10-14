package day3_CoreJava;
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
import java.io.*;
import java.lang.reflect.Array;
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

//class CPU {
//    double price;
//    // nested class
//    class Processor{
//        // members of nested class
//        double cores;
//        String manufacturer;
//        double getCache(){
//            return 4.3;
//        }
//    }
//    // nested protected class
//    protected class RAM{
//        // members of protected nested class
//        double memory;
//        String manufacturer;
//        double getClockSpeed(){
//            return 5.5;
//        }
//    }
//}
//public class July21_Que1 {
//    public static void main(String[] args) {
//        CPU cpu=new CPU();
//        CPU.Processor processor = cpu.new Processor();
//        CPU.RAM ram = cpu.new RAM();
//        System.out.println(processor.getCache());
//        System.out.println(ram.getClockSpeed());
//
//
//    }
//
//}

//class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

//    public static String isValid(String s) {
//        // Write your code here
////        List<Integer> list = new ArrayList<>();
////        char [] str = new char[s.length()];
////        str = s.toCharArray();
////        Arrays.sort(str);
////        for (int i = 0; i < str.length; i++) {
////            int count = 1;
////            for(int j = i+1 ; j < str.length ; j++){
////                if(str[i] == str[j]){
////                    count=count+1;
////                }else{
////                    i=j;
////                    list.add(count);
////                    break;
////                }
////            }
////        }
////return list;
//
//        HashMap<Character,Integer> hashMap=new HashMap();
//        for(int i=0;i<s.length();i++)
//        {
//            if(hashMap.containsKey(s.charAt(i)))
//            {
//                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
//            }
//            else {
//                 hashMap.put(s.charAt(i),1);
//            }
//        }
//        List<Integer> integers=new ArrayList<>();
//       for(Character stringIntegerEntry:hashMap.keySet())
//       {
//         integers.add(hashMap.get(stringIntegerEntry));
//       }
//       Collections.sort(integers);
//       List<Integer>l=integers.stream().filter(s2->integers.get(integers.size()-1)==s2).collect(toList());
//       if (integers.size() == l.size()){
//           return "YES";
//       }else{
//           return "NO";
//       }
//    }
//
//}
class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int noOfTallestCandles = 1;
        Collections.sort(candles);
        for (int i = candles.size()-1; i >= 0; i--) {
            if(candles.get(i)==candles.get(i-1)){
                noOfTallestCandles++;
            }else{
                break;
            }
        }
        return noOfTallestCandles;
    }
}

public class July21_Que1
 {

         public static void main(String[] args) throws IOException {
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

             int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

             List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                     .map(Integer::parseInt)
                     .collect(toList());

             int result = Result.birthdayCakeCandles(candles);
             System.out.println(result);
//             bufferedWriter.write(String.valueOf(result));
//             bufferedWriter.newLine();

             bufferedReader.close();
//             bufferedWriter.close();
         }
     }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        List<Integer> list = Result.isValid(s);
//
////        System.out.println(list);
////        bufferedWriter.write(result);
////        bufferedWriter.newLine();
////
////        bufferedReader.close();
////        bufferedWriter.close();
    }
}
