package day6_CoreJava_Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Print_Nth_Index{
    public void display_Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int index = sc.nextInt();
        int [] array = {10,60,40,20,30,90,100,70,80,50};
        Arrays.sort(array);
        System.out.print("The "+index+" highest number in the array is : ");
        System.out.println(array[array.length-index]);

    }
}

public class Que6 {
    public static void main(String[] args) {
        Print_Nth_Index print_nth_index = new Print_Nth_Index();
        print_nth_index.display_Data();
    }
}
//=========================================
//output is
//        enter the number
//        2
//        The 2 highest number in the array is : 90
//
//        Process finished with exit code 0
//
