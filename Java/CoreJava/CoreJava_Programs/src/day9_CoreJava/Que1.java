package day9_CoreJava;

import java.util.Scanner;

/**
1)CREATE A CLASS NAMED SHAPE,WHICH CONTAINS ONLY SINGLE
METHOD,calculateArea0. THIS METHOD SHOULD HAVE N*NUMBER OF
PARAMETERS FOR DIFFERENT SHAPES LIKE FOR
CIRCLE,RECTANGLE,TRIANGLE
 */
class Shape{
    void calculate_Area(float... a){
        switch((int) a[0]){
            case 1:
                System.out.println("Area of circle is : "+Math.PI*a[1]*a[1]);
                break;
            case 2:
                System.out.println("Area of rectangle is : "+a[1]*a[2]);
                break;
            case 3:
                System.out.println("Area of triangle is : "+(0.5*a[1]*a[2]));
                break;

        }

    }
}
public class Que1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("which shape area you want :\n enter 1 for circle \n enter 2 for rectangle \n enter 3 for triangle ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch(i){
            case 1:
                System.out.println("Enter the radius of circle : ");
                float radius = sc.nextFloat();
                shape.calculate_Area(i,radius);
                break;
            case 2:
                System.out.println("Enter the length and breadth of rectangle : ");
                float length = sc.nextFloat();
                float breadth = sc.nextFloat();
                shape.calculate_Area(i,length,breadth);
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle : ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                shape.calculate_Area(i,base,height);
                break;
        }
    }
}
/*
out put is
which shape area you want :
 enter 1 for circle
 enter 2 for rectangle
 enter 3 for triangle
2
Enter the length and breadth of rectangle :
10
15
Area of rectangle is : 150.0

Process finished with exit code 0

 */