package Day6_CoreJava;

import java.util.Arrays;

class Copy_Array {
    public void print_Array(){
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = new int[array1.length] ;
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("array 1 has element : "+ Arrays.toString(array1));
        System.out.println("array 2 has copied the elements of array1 : "+ Arrays.toString(array2));
        }
    }
public class Que3 {
    public static void main(String[] args) {
        Copy_Array copy_array = new Copy_Array();
        copy_array.print_Array();
    }
}
//=============================
//output is
//    array 1 has element : [1, 2, 3, 4, 5, 6, 7]
//    array 2 has copied the elements of array1 : [1, 2, 3, 4, 5, 6, 7]
//
//Process finished with exit code 0
