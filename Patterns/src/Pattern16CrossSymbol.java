public class Pattern16CrossSymbol {
    public static void main(String[] args) {
        int index1 = 1,index2 = 7;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= 7 ; j++) {
                if (j == index1){
                    System.out.print((char)92);
                }
                else if(j == index2){
                    System.out.print("/");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            index1++;
            index2--;
        }
    }
}
