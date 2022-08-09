import java.util.Arrays;
//bubblesort Algorithm
public class Main {
    public static void main(String[] args) {
        int [] array = {2,6,7,9,4,8,3,5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j+1]<array[j]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int a : array){
            System.out.print(a);
        }
    }
}