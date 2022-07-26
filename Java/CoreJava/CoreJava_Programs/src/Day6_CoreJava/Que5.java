package Day6_CoreJava;

class Addition_Of_Jagged_Array {
    public void addition() {
        int[][] array1 = {{1, 2, 3}, {2, 3}, {6}};
        int[][] array2 = {{2, 3, 1}, {3, 2}, {3}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Que5 {
    public static void main(String[] args) {
        Addition_Of_Jagged_Array addition_of_jagged_array = new Addition_Of_Jagged_Array();
        addition_of_jagged_array.addition();
    }
}
//==========================
//output is
//        3 5 4
//        5 5
//        9
//
//        Process finished with exit code 0

