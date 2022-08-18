public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,4,6,1,9,8,5,3,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}
