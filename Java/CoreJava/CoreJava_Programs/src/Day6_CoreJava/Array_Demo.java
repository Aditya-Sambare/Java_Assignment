package Day6_CoreJava;
class Jagged_Array{
    public void display_Data(){
        int jagged_array [][] = {{1,2,3},{3,5},{7,2,8,2}};
        for (int i = 0 ; i < jagged_array.length; i++){
            for (int j = 0 ; j < jagged_array[i].length ; j++){
                System.out.print(jagged_array[i][j] + " ");
            }
            System.out.println();


        }


    }
}
public class Array_Demo {
    public static void main(String[] args) {
        Jagged_Array jagged_array = new Jagged_Array();
        jagged_array.display_Data();

    }
}
//====================================
//output is
//        1 2 3
//        3 5
//        7 2 8 2
