package Day4_CoreJava;
import java.util.*;
class Compare_Numbers{
    public static void compare_Two_Numbers(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers to compare");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        if (number_1 > number_2)
            System.out.println("Greatest number is : " + number_1);
        else
            System.out.println("Greatest number is : " + number_2);
    }
}
public class Que5 {
    public static void main(String[] args) {

        Compare_Numbers.compare_Two_Numbers();
    }
}
//=============================================
//output is
//        Enter two numbers to compare
//        20
//        12
//        Greatest number is : 20
//
//        Process finished with exit code 0

