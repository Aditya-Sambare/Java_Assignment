package Day3_CoreJava;
class Opretors{

     public static void arithmaticOperators (){
        // declare variables
        int num1 = 20, num2 = 10;
         System.out.println("Arithmatic Operators");
        // addition operator
        System.out.println("num1 + num2 = " + (num1 + num2));

        // subtraction operator
        System.out.println("num1 - num2 = " + (num1 - num2));

        // multiplication operator
        System.out.println("num1 * num2 = " + (num1 * num2));

        // division operator
        System.out.println("num1 / num2 = " + (num1 / num2));

        // modulo operator
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
    public static void assignmentOperators(){
        // create variables
        int a = 4;
        int var;
        System.out.println("Assignment Operators");

        // assign value using =
        var = a;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);
    }
    public static void relationalOperators(){

        // create variables
        int a = 9, b = 18;
        System.out.println("Relational Operators");

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println("a == b is ::"+ (a == b));  // false

        // != operator
        System.out.println("a != b is ::"+(a != b));  // true

        // > operator
        System.out.println("a > b is ::"+(a > b));  // false

        // < operator
        System.out.println("a < b is ::"+(a < b));  // true

        // >= operator
        System.out.println("a >= b is ::"+(a >= b));  // false

        // <= operator
        System.out.println("a <= b is ::"+(a <= b));  // true
    }
    public static void logicalOperators(){
        System.out.println("Logical Operator");
        // && operator
        System.out.println("(5 > 3) && (8 > 5) is :"+((5 > 3) && (8 > 5)));  // true
        System.out.println("(5 > 3) && (8 < 5) is :"+((5 > 3) && (8 < 5)));  // false

        // || operator
        System.out.println("(5 < 3) || (8 > 5) is :"+((5 < 3) || (8 > 5)));  // true
        System.out.println("(5 > 3) || (8 < 5) is :"+((5 > 3) || (8 < 5)));  // true
        System.out.println("(5 < 3) || (8 < 5) is :"+((5 < 3) || (8 < 5)));  // false

        // ! operator
        System.out.println("!(5 == 3) is :"+(!(5 == 3)));  // true
        System.out.println("!(5 > 3) is :"+(!(5 > 3)));  // false
    }
    public static void unaryOperators(){
        System.out.println("Unary Operators");
        int num = 5;
        System.out.println("num is "+num);

        // increase num by 1
        System.out.println("++num is : "+(++num));
        // decrease num by 1
        System.out.println("--num is : "+(--num));
    }

    }


public class july21_Que3 {
    public static void main(String[] args) {
        Opretors.arithmaticOperators();
        Opretors.assignmentOperators();
        Opretors.relationalOperators();
        Opretors.logicalOperators();
        Opretors.unaryOperators();




    }

}
