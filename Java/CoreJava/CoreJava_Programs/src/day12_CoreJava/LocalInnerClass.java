package day12_CoreJava;
class Outer {
    public void display(){
        System.out.println("this is inside method display");
        class Inner{
            public void show(){
                System.out.println("this is inside local inner class");
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
