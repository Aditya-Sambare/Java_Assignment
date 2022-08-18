package day13_CoreJava_Strings;
import java.util.Scanner;
/**
 *  2) Count the total number of vowels and consonants in a string.
 */
class CountOfVowelsAndConsonant{
    void count(){
        int vowels = 0 , consonants = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
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
public class Que2_CountVowelsAndConsonants {
    public static void main(String[] args) {
        CountOfVowelsAndConsonant countOfVowelsAndConsonant = new CountOfVowelsAndConsonant();
        countOfVowelsAndConsonant.count();
    }
}
/*
output is:::::
enter the string
Aditya loves java
Number of vowels in string are : 7 Number of consonants in string are : 8

Process finished with exit code 0
 */