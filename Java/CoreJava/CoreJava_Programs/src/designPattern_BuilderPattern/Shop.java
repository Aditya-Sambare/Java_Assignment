package designPattern_BuilderPattern;

public class Shop {
    public static void main(String[] args) {
          //    Laptop laptop = new Laptop("ryzen 5",8,"1 tb",15);
        Laptop laptop1 = new Builder().setProcesor("intel i7 11 gen").setRam(16).setMemory("2 tb").getLaptop();
     //  System.out.println(laptop);
       System.out.println(laptop1);
    }
}
