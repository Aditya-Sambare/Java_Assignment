package Day4_CoreJava;
import java.util.*;
class Compare_Age{
    public static void what_Is_The_Age(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of first person");
        int age1 = sc.nextInt();
        System.out.println("Enter the age of second person");
        int age2 = sc.nextInt();
        System.out.println("Enter the age of third person");
        int age3 = sc.nextInt();
        if (age1 > age2){
            if (age1 > age3)
                System.out.println("first person is oldest");
            else
                System.out.println("third person is oldest");
            }
        else if (age2 > age3)
            System.out.println("second person is oldest");
        else
            System.out.println("third person is oldest");

        if (age1 < age2){
            if (age1 < age3)
                System.out.println("first person is youngest");
            else
                System.out.println("third person is youngest");
        }
        else if (age2 < age3)
            System.out.println("second person is youngest");
        else
            System.out.println("third person is youngest");
    }
}
public class Que6 {
    public static void main(String[] args) {

        Compare_Age.what_Is_The_Age();
    }
}
//====================================
//output is
//        Enter the age of first person
//        10
//        Enter the age of second person
//        20
//        Enter the age of third person
//        30
//        third person is oldest
//        first person is youngest
//
//        Process finished with exit code 0
