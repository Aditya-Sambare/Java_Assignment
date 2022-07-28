package day4_CoreJava;
class Temperature{
    public static void how_Is_The_Temperature(int a) {
        switch (a) {
            case 1:
                System.out.println("Low");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("High");
                break;
            default:
                System.out.println("Abnormal");

        }
    }
}
public class Que3 {
    public static void main(String[] args) {
        int temprature = 1;
        Temperature.how_Is_The_Temperature(temprature);

    }
}
//==========================
//output is
//        Low
//
//        Process finished with exit code 0


