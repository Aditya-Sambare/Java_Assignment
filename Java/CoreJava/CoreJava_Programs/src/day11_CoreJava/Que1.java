package day11_CoreJava;
/**
 * Q1What is Constructor chaining?
 */
class Demo1{
    Demo1(){ // this is constructor 1
        System.out.println("This is demo 1");
    }
    Demo1(int x){ // this is constructor 2
        this(); //this line will point towards the constructor 1.
        System.out.println("This is constructor 2");
    }
    Demo1(int x , int y){ //this is constructor 3
        this(2); //this line will point towards the constructor 2 and will pass the value 2 to that costructor
        System.out.println("This is constructor 3");
    }
}
class Demo2 extends Demo1{
    public Demo2(int x, int y) {
        super(x, y); // this will point to the constructor 3 and will pass the value x ,y to that constructor
        System.out.println("This is constructor 4 which is present in child class");
    }
}
public class Que1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo2(2,3); // this object will point towards the constructor 3 with two parameter and it passes the two values to that parameter
    }
}
//here we are calling all constructor by only one constructor and this is called Constructor chaining
/*
out put is
This is demo 1
This is constructor 2
This is constructor 3
This is constructor 4 which is present in child class

 */