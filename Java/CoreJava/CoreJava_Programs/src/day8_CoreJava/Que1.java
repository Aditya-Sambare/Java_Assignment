package day8_CoreJava;
/** 1.Write a program in which you will declare an abstract class Vehicle inherits this
class from two classes car and truck using the method engine in both display "car has
        good engine" and "truck has bad engine". */
abstract class Vehicle{
    abstract void engine();
}
class Car extends Vehicle{
    @Override
    void engine() {
        System.out.println("car has a good engine");
    }
}
class Truck extends Vehicle{
    @Override
    void engine() {
        System.out.println("truck has a bad engine");
    }
}
public class Que1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Truck();
        vehicle.engine();
        vehicle1.engine();
    }
}
/* output is
car has a good engine
truck has a bad engine

Process finished with exit code 0

 */