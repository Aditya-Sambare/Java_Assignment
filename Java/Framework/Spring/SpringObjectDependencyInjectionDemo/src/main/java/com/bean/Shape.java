package com.bean;

public class Shape {
    Circle circle;
    Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "circle=" + circle +
                ", triangle=" + triangle +
                '}';
    }
    public void display(){
        circle.display();
       triangle.display();
    }
}
