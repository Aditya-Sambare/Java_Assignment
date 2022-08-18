package day6_CoreJava_Arrays;
import java.util.Arrays;
import java.util.Collections;
class Arrays_demo {
    Integer[] array ={22,43,12,76,89,76,45,21,34,28};
    {
        System.out.println("original array is : "+Arrays.toString(array));
        Arrays.sort(array);
    }
    public void ascending_Order(){
        System.out.println("Ascending order of array is : "+Arrays.toString(array));
    }
    public void descending_Order(){
        Collections.reverse(Arrays.asList(array));
        System.out.println("descending order of array is : "+Arrays.toString(array));
    }
}
public class Que2 {
    public static void main(String[] args) {
        Arrays_demo arrays_demo = new Arrays_demo();
        arrays_demo.ascending_Order();
        arrays_demo.descending_Order();
    }
}
//=============================================
//output is
//      original array is : [22, 43, 12, 76, 89, 76, 45, 21, 34, 28]
//      Ascending order of array is : [12, 21, 22, 28, 34, 43, 45, 76, 76, 89]
//      descending order of array is : [89, 76, 76, 45, 43, 34, 28, 22, 21, 12]
//
//Process finished with exit code 0
