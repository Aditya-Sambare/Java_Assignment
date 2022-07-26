package Day6_CoreJava;
class Area
{
    private double length;
    private double width;
    private double area;
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        area=length*width;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }



}
public class Que8 {
    public static void main(String[] args) {
        Area a=  new Area();
        a.setLength(10);
        a.setWidth(20);
        System.out.println("area of rectangle is : "+a.getArea());
    }
}
//=========================================
//output is
//        area of rectangle is : 200.0
//
//        Process finished with exit code 0
