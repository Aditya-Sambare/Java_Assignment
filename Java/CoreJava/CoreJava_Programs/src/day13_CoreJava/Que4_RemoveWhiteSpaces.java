package day13_CoreJava;

import static java.lang.Character.codePointAt;
import static java.lang.Character.getType;

/**
 * 4)Remove both leading and trailing white space characters from the given string and
 *  * also showcase the Unicode value of the character present at index 5.
 */
class RemoveWhiteSpace{
    void removeWhiteSpace(){
        String str = "    Aditya Sambare       ";
        System.out.println("String before removing white spaces : "+str);
                str=str.trim();
        System.out.println("String after removing white spaces : "+str);
        System.out.print("the unicode of char at 5 th index is : "+codePointAt(str,5));
    }
}
public class Que4_RemoveWhiteSpaces {
    public static void main(String[] args) {
        RemoveWhiteSpace removeWhiteSpace = new RemoveWhiteSpace();
        removeWhiteSpace.removeWhiteSpace();
    }
}
/*output is::::::
String before removing white spaces :     Aditya Sambare
String after removing white spaces : Aditya Sambare
the unicode of char at 5 th index is : 97
Process finished with exit code 0
 */