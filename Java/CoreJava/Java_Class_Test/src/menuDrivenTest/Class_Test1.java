package menuDrivenTest;

import java.util.Arrays;
class Array1{
    public void main() {
        int[] arr = {2, 15, 1, 100, 70};
        System.out.print("Array is : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        int largest = 1;
        System.out.println(+largest+" largest no is : "+arr[arr.length - largest]);

        int whichLargest = 2;
        System.out.print(whichLargest + " largest no is : " + arr[arr.length - whichLargest]);
    }
}
public class Class_Test1 {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.main();
    }
}
/*
out put is:
Array is : 2 15 1 100 70
1 largest no is : 100
2 largest no is : 70
Process finished with exit code 0
 */
