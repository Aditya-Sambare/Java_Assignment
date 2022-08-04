package day13_CoreJava;

import java.util.Scanner;

/**
 * 3) Remove all repeated characters from a given string.
 */
class RemoveRepeatChar{
    void remove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String string = new String();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(string.indexOf(a)<0){
                string += a;
            }
        }
        System.out.println(string);
    }
}
public class Que3_RemoveRepeatCharacter {
    public static void main(String[] args) {
        RemoveRepeatChar removeRepeatChar = new RemoveRepeatChar();
        removeRepeatChar.remove();
    }
}
/*
output is::
Enter the string
aditya sambare
adity smbre

Process finished with exit code 0

 */