public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 7  ; i++) {
            for (int j = 1; j <=7 ; j++) {
                if(i<=4 && j >= 5 - i && j <= 3 + i) {
                    System.out.print("*");
                }
                else if(i>4 && j >= -3 + i && j <= 11 - i) {
                    System.out.print("*");
                }
                else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}
