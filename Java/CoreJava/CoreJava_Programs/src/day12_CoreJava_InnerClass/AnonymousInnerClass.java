package day12_CoreJava_InnerClass;
interface Animal{
    public void sleep();
    public void eat();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sleep() {
                System.out.println("sleep method of animal");
            }

            @Override
            public void eat() {
                System.out.println("eat method of animal");
            }
        };
        animal.eat();
        animal.sleep();
    }
}
