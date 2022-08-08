/*

//str 5 words
//accending length wise
//count vovels
//token add"&"

import com.sun.istack.internal.Pool;
import jdk.internal.dynalink.linker.LinkerServices;

import java.util.Scanner;
class implimentation {
    void convert() {
        //Scanner s = new Scanner(System.in);
        //System.out.println("Enter 5 words");
        //String str = s.next();
        String[] str1 = {};
        //str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {

            System.out.println(str1[i]);
        }

        //vowels and consonants
        int vowels = 0, consonants = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                            str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
                            str.charAt(i) == 'U'){
                        vowels++;
                    }
                    else if (str.charAt(i) == ' '){
                        continue;
                    }
                    else{
                        consonants++;
                    }
                }
                System.out.println("Number of vowels in string are : "+vowels+" Number of consonants in string are : "+consonants);
            }
        }
public class test3 {
    public static void main(String[] args) {

        implimentation implimentation = new implimentation();
        implimentation.convert();

    }
}

*/
