package day4_CoreJava;
import java.util.*;
class Skip_Todays_Day{
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter todays day");
        String today = sc.next();
        String [] week_Days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (String s :week_Days){
            if(s.equalsIgnoreCase(today))
                continue;
            else
                System.out.println(s);
        }
    }
}
public class Que7_2 {
    public static void main(String[] args) {
        Skip_Todays_Day.display();
    }
}
//==============================
//        output is
//        Enter todays day
//        saturday
//        Monday
//        Tuesday
//        Wednesday
//        Thursday
//        Friday
//        Sunday
//
//        Process finished with exit code 0
