package Day4_CoreJava;
class Print_pattern2{
     static void display(){
        int a = 65;
        for(int i = 1;i <= 6; i++){
            for(int j = 1;j <= i; j++){
                System.out.print((char)a);
            }
            a++;
            System.out.println();
        }
    }
}
public class Que8_pattern2 {
    public static void main(String[] args) {
        Print_pattern2.display();
    }
}
//==========================
//output is
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
//        FFFFFF
//
//        Process finished with exit code 0