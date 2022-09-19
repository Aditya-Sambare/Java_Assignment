package com.bean;

public class Circle {
    int radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void Area(){

        System.out.println("Area of Circle is : " + 3.14 * radius * radius);
    }
}
