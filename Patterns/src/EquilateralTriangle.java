class Display1{
    public static void display1(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j<=i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class EquilateralTriangle {
    public static void main(String[] args) {
        Display1.display1();
    }
}
