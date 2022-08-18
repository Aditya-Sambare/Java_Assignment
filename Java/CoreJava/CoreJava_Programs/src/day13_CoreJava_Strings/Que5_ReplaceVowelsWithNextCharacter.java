package day13_CoreJava_Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *  5)Accept 5 names of string type, count the length.and as per their length assign there
 *  * order (Ascending).
 *  * ->Replace above strings "vowel characters" with their next letter.
 *  * =>Ex. "Aarti" => Vowels present here are ==>a(2),i(1)
 *  * =>next character of "a" is "b" and for "i" its "j"
 *  * =>so.final string will be "bbrti"
 */
class Replace{
    void replace(){
        Scanner sc = new Scanner(System.in);
            StringBuffer[] strings ={new StringBuffer("Aditya"),
                    new StringBuffer("Anuj"),
                    new StringBuffer("Arjun"),
                    new StringBuffer("Adi"),
                    new StringBuffer("Abhishek")};

        Arrays.sort(strings, Comparator.comparingInt(StringBuffer::length));
            System.out.println("---------------------- Strings after reordering ------------------");
            for (StringBuffer s : strings){
                System.out.println(s);
            }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) == 'a' || strings[i].charAt(j) == 'e' || strings[i].charAt(j) == 'i'
                        || strings[i].charAt(j) == 'o' || strings[i].charAt(j) == 'u' || strings[i].charAt(j)
                        == 'A' || strings[i].charAt(j) == 'E' || strings[i].charAt(j) == 'I' ||
                        strings[i].charAt(j) == 'O' || strings[i].charAt(j) == 'U'){
                    char c = strings[i].charAt(j);
                    int ascii = (int) c;
                    int d = c+1;
                   char ch = (char)d;
                      strings[i].setCharAt(j,ch);
                }
            }
        }
        System.out.println("String after replacing vowels");
        for (StringBuffer s : strings){
            System.out.println(s);
        }
        }
    }
public class Que5_ReplaceVowelsWithNextCharacter {
    public static void main(String[] args) {
        Replace replace = new Replace();
        replace.replace();
    }
}
/*
output is
---------------------- Strings after reordering ------------------
Adi
Anuj
Arjun
Aditya
Abhishek
String after replacing vowels
Bdj
Bnvj
Brjvn
Bdjtyb
Bbhjshfk

Process finished with exit code 0

 */