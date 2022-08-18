package day11_CoreJava_Constructor_Reflection;

import java.lang.reflect.Field;

/**
 * Q3)Try to access private variable of class using reflection
 */
class Person{
    private int aadharNo;
    private int panNo;
    private String name;

    public Person(int aadharNo, int panNo, String name) {
        this.aadharNo = aadharNo;
        this.panNo = panNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "aadharNo=" + aadharNo +
                ", panNo=" + panNo +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Que3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person(11223344,11112222,"Aditya");
        Field privateField
                = Person.class.getDeclaredField("name");
        Field privateField1
                = Person.class.getDeclaredField("panNo");
        privateField.setAccessible(true);
        privateField1.setAccessible(true);
        String name = (String)privateField.get(person);
        int panNo = (int)privateField1.get(person);
        System.out.println("Name is "+name+" and PanNo. is:"+panNo);

    }
}
/*
output is
Name is Aditya and PanNo. is:11112222
 */