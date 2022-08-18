package day6_CoreJava_Arrays;

import java.util.Arrays;

class Duplicate {
    public void remove_Duplicate() {
        int count = 0;
        String[] names = {"aditya", "arnav", "advait", "aditya", "arjun", "abir", "advait"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j]) && names[i]!="") {
                    System.out.println(names[i]);
                    //names[j] = "";
                    count++;

                }
            }
        }
        String names_new[] = new String[names.length-count];
        names_new = Arrays.stream(names).distinct().toArray(String[]::new);
//        int j = 0;
//        String names_new[] = new String[names.length-count];
//
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].length()>1) {
//                names_new[j++] = names[i];
//
//            }
//        }
        System.out.println("Array after removal of duplicate elements");
        for(String s: names_new)
            System.out.println(s);
    }
}
public class Que4 {
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        duplicate.remove_Duplicate();
    }
}
