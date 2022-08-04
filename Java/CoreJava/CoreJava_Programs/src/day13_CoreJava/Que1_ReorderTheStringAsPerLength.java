package day13_CoreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1)Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and
 * reorder it.
 */
class ReorderString {
    Scanner sc = new Scanner(System.in);

    void Strings() {
        String[] strings = new String[5];
        System.out.println("Enter 5 names");
        for (int i = 0; i < strings.length; i++ ){
            strings[i] = sc.nextLine();
        }
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("---------------------- Strings after reordering ------------------");
        for (String s : strings){
            System.out.println(s);
        }

    }
}
public class Que1_ReorderTheStringAsPerLength {
    public static void main(String[] args) {
        ReorderString reorderString = new ReorderString();
        reorderString.Strings();
    }
}
/*
output is
Enter 5 names
aditya
anuj
arjun
adi
abhishek
---------------------- Strings after reordering ------------------
adi
anuj
arjun
aditya
abhishek

Process finished with exit code 0

 */