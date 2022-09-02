public class Pattern15NumberPlayButton {
    public static void main(String[] args) {
        for (int i = 1; i <= 9  ; i++) {
            int num = 1;
            for (int j = 1; j <= 5 ; j++) {
                if (i <= 5){
                    if (j >= 6-i){
                        System.out.print(num);
                        num++;
                    }else{
                        System.out.print(" ");
                    }
                }
                else if (i > 5){
                    if (j >= (-4+i)){
                        System.out.print(num);
                        num++;
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
