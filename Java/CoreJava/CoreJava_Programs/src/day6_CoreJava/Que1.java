package day6_CoreJava;
import java.util.Arrays;
class Methods_Array{
    public void showmethod(){
        int[] arr1 =new int[10];
        //1- Arrays.fills()
        Arrays.fill(arr1,20);
        //2- to print whole Array in go
        System.out.println(Arrays.toString(arr1));

        int[] arr ={100,30,20,50,10};
        //3- Arrays.sort();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //4- equals() :Checks if both the arrays are equal or not
        System.out.println(arr.equals(arr1));
        System.out.println(Arrays.equals(arr,arr1));

        //5- hashCode() return hashCode of array instance actually it is memory address of Array instance
        System.out.println(arr.hashCode());
        // Arrays.copyOf() this method is used to make a copy of given array
        int[] newArr =Arrays.copyOf(arr,arr.length);
        System.out.println("Copied Array is : "+Arrays.toString(newArr));
    }
}
public class Que1 {
    public static void main(String[] args) {
        Methods_Array methods_array = new Methods_Array();
        methods_array.showmethod();
    }
}
//=======================================
//output is
//        [20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
//        [10, 20, 30, 50, 100]
//        false
//        false
//        460141958
//        Copied Array is : [10, 20, 30, 50, 100]
//
//        Process finished with exit code 0
