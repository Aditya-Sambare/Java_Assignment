public class PlayButtonPattern {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                if (j<=i && i<=3){
                    System.out.print("*");
                }
                else if( j<=4-k &&  ){
                    System.out.print("*");
                    k = k+2;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
