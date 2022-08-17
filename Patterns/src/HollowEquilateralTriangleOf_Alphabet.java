public class HollowEquilateralTriangleOf_Alphabet {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {
            int ch = 65;
            for (int j = 1; j <= 7 ; j++) {
                if (j <= 5-i || j >= 3+i){
                    if (j < 4) {

                        System.out.print((char)ch);
                        ch++;
                    }
                    else {

                        System.out.print((char)ch);
                        --ch;
                    }
                }
                else {
                    System.out.print(" ");
                    if(j == 4){
                        ch--;
                    }
                }
            }
            System.out.println();
        }
    }
}
