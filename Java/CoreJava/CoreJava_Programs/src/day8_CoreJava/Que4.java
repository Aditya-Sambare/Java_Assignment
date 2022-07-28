package day8_CoreJava;


/**
 * 4).Create an abstract class shape with abstract method void areaO;
 * create 4 more classes circle, cylinder, square and rectangle
 * shape
 * circle
 * square
 * cylinder
 * SHAPE is parent for circle and square, and circle is parent for cylinder rectangle is child
 * of square.
 * Override the area() in all the classes Create an array of references of type shape in
 * TestShape class and print the area of different types of shapes.
 */
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    @Override
    void area() {
        System.out.println("area for circle is pi*r*r");
    }
}
class Cylinder extends Circle{
    @Override
    void area() {
        //super.area();
        System.out.println("area of cylinder is 2πrh+2πr*r");
    }
}
class Square extends Shape{
    @Override
    void area() {
        System.out.println("area of square is a*a");
    }
}
class Rectangle extends Square{
    @Override
    void area() {
        //super.area();
        System.out.println("area of rectangle is l*b");
    }
}
class TestShape{
    public void test() {
        Shape shape[] ;
        shape= new Shape[4];
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    shape[i] = new Circle();
                    break;
                case 1:
                    shape[i] = new Cylinder();
                    break;
                case 2:
                    shape[i] = new Square();
                    break;
                case 3:
                    shape[i] = new Rectangle();
                    break;
            }
        }
        for (int i = 0; i < 4; i++) {
            shape[i].area();
        }
    }
}
public class Que4 {
    public static void main(String[] args) {
        TestShape testShape = new TestShape();
        testShape.test();
    }
}
/*
out put is
area for circle is pi*r*r
area of cylinder is 2πrh+2πr*r
area of square is a*a
area of rectangle is l*b

 */
