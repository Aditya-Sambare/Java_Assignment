public class Pattern14Numbers {
    public static void main(String[] args) {
        int decrement = 0;
        for (int i = 1; i <= 7 ; i++) {
            int num = 7 - decrement;
            for (int j = 1; j <= 7 ; j++) {
                if (j<= 8-i){
                    System.out.print(--num);
                }
            }
            System.out.println();
            decrement++;
        }
    }
}
