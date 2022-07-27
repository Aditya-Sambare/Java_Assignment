package Day7_CoreJava;
//parent class
class Shape{
    public void area(){
        System.out.println("this is arae");
    }

}
//child class
class Circle extends Shape{
    int radius = 3;
    float area = 0.0f;
    public void area(){
        area=(float)(Math.PI * radius * radius);
        System.out.println(area);
        System.out.println(radius);
    }

}
public class SingleLevel_Inheritance_Demo {
    public static void main(String[] args) {
//        //way 1 parent class object
//        Shape shape = new Shape();
//        shape.area();
//        //way 2 child class object with parent refrence
//        Shape shape1 = new Circle();
//        shape1.area();
        //way 3 child class object with chid class refrence
        Circle circle = new Circle();
        circle.area();

    }
}
