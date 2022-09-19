package com.bean;

public class Triangle {

    int base,height;
    String name;

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Area(){
        System.out.println("Area of : " + name + "is : " +0.5 * base * height);
    }
}
