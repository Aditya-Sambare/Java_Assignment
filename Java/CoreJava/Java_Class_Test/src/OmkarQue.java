import java.util.Arrays;
public class OmkarQue {
    public static void main(String[] args) {
        int [] arr = {2,7,9,4,6,7,1,3};
        int length = 0;
        for(int i :arr) {
            length = length+1;
        }
        System.out.println(length);
        int l =length-1;
        for (int i = 0; i < length/2; i++) {
                int temp = arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l--;
        }
        for (int a :arr){
            System.out.print(a);
        }
    }
}
