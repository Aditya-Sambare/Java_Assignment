package Day5_CoreJava;

public class Que5{
    private static int x=10;
    static {
        x++;
    }
        static {
            ++x;
        }
 {
            x--;
        }
        public static void main(String[] args) {
            Que5 obj = new Que5();
            Que5 obj2 = new Que5();
            Que5 obj3 = new Que5();
            System.out.println(x);
        }
}