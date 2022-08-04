package day13_CoreJava;

/**
 * 6)Convert String data into array and present it
 *
 *
 */
class ConvertToArray {
    void convert() {
        String str = "coditas llp pune ";
        String[] str1 = null;
        str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
public class Que6_ConvertStringIntoArray {
        public static void main(String[] args) {
            ConvertToArray convertToArray = new ConvertToArray();
            convertToArray.convert();
        }
}
/*
output is :
coditas
llp
pune

Process finished with exit code 0

 */