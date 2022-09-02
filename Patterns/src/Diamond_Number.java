public class Diamond_Number {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int count = 1;
            for (int j = 1; j <= 9; j++) {
                if (i <= 5) {
                    if (j >= 6 - i && j <= 4 + i) {
                        if (j < 5) {
                            System.out.print(count);
                            count++;
                        } else if (j >= 5) {
                            System.out.print(count);
                            count--;
                        }
                    } else {
                        System.out.print(" ");
                        count++;
                    }
                }
                if (i > 5) {
                    if (j >= (-4+i) && j <= 14 - i) {
                        if (j < 5) {
                            System.out.print(count);
                            count++;
                        } else if (j >= 5) {
                            System.out.print(count);
                            count--;
                        }
                    } else {
                        System.out.print(" ");
                        count++;
                    }
                }
            }
                System.out.println();
        }
    }
}