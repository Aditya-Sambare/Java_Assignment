package day15_CoreJava_ExceptionHandling;
/**
 * 3)
 * public class ABC
 * public static void main(String) args) {
 * int[] array = new int[10]; int sum = 0;
 * //good code
 * for (int i = o; i < array.length; i++) {
 * sum = sum + array[i];
 * }
 * }
 * }
 * Try it for conditions
 * 1)i < 10
 * 2)i < 11
 */
class ArrayIndexOutOfBoundExceptionDemo{
    void arrayIndexOutOfBoundException(){
        int[] array = new int[10]; int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occoured "+e);
        }
        }
    }
public class Que3_Array_Index_OutOfBound {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundExceptionDemo arrayIndexOutOfBoundException = new ArrayIndexOutOfBoundExceptionDemo();
        arrayIndexOutOfBoundException.arrayIndexOutOfBoundException();
    }
}
/*
output is-
0
0
Exception occoured java.lang.ArrayIndexOutOfBoundsException: 10

Process finished with exit code 0

 */