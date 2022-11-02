import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void almostSorted(List<Integer> arr) {
        // Write your code here
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(arr);
        Collections.sort(arr);
        int count = 0 ;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != list1.get(i)){
                count++;
                list.add(i);
            }
        }
        if (count == 2){
            int temp = list1.get(list.get(0));
            list1.set(list.get(0),list1.get(list.get(1)));
            list1.set(list.get(1),temp);
            if(list1.equals(arr)){
                System.out.println("yes");
                System.out.println("swap "+ (list.get(0)+1) +" "+ (list.get(1)+1));
            }else{
                System.out.println("no");
            }
        } else{
            if (arr.size()%2 != 0){
                System.out.println("no");
            }else {
                List<Integer> list2 = new ArrayList<>();
                List<Integer> list3 = new ArrayList<>();
                for (int i = 0; i <= (list.get(0) - 1); i++) {
                    list2.add(list1.get(i));
                }
                for (int i = list.get(0); i <= list.size(); i++) {
                    list3.add(list1.get(i));
                }
                //    System.out.println(list3);
                Collections.reverse(list3);
                list2.addAll(list3);
                //    System.out.println(list2);
                for (int i = (list.get(list.size() - 1) + 1); i < list1.size(); i++) {
                    list2.add(list1.get(i));
                }
                System.out.println(list);

                System.out.println(list2.equals(arr));
                if (list2.equals(arr)) {
                    System.out.println("yes");
                    System.out.println("reverse " + (list.get(0) + 1) + " " + (list.get(list.size() - 1) + 1));
                }else {
                    System.out.println("no");
                }
            }
        }
    }

}
public class Question2_AlmostSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result2.almostSorted(arr);

        bufferedReader.close();
    }
}
