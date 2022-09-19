package com.bean;

public class Circle {
    private int radius;
    private Point center;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void display(){
        System.out.println("============Circle==============");
        System.out.println("radius is "+getRadius());
        System.out.println("center is "+getCenter());
    }
}
