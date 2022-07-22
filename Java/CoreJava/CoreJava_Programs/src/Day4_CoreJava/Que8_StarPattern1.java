package Day4_CoreJava;
class print_Pattern{
    public static void display(){
        int b = -1;
        for(int i = 1 ; i <= 9 ; i++){
            int a=i<=5?b++:b--;
            for (int j = 1; j <= 9 ; j++){
                if(j >= 5 - b && j <= 5 + b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class Que8_StarPattern1 {
    public static void main(String[] args) {
        print_Pattern.display();
    }
}
