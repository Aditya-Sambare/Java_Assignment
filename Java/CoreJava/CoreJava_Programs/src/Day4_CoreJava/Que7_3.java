package Day4_CoreJava;
import java.util.*;
class Skip_Todays_Date{
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter todays date");
        int date = sc.nextInt();
        for (int i = 1;i <= 31;i++){
            if (i == date)
                break;
            System.out.println(i);
        }
    }
}
public class Que7_3 {
    public static void main(String[] args) {
        Skip_Todays_Date.display();

    }
}
