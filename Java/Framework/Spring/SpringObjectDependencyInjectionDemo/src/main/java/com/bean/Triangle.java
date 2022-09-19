package com.bean;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public void display(){
        System.out.println("=================triangle===============");
        System.out.println("point a is "+getA());
        System.out.println("point b is "+getB());
        System.out.println("point c is "+getC());
    }
}
