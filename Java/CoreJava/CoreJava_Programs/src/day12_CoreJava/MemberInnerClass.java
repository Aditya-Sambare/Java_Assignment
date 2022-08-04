package day12_CoreJava;
class MemberOuter{
    class MemberInner{
        public void display(){
            System.out.println("this is inner class");
        }
    }
    public void show(){
        System.out.println("this is outer class");
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        MemberOuter memberOuter = new MemberOuter();
        memberOuter.show();
        MemberOuter.MemberInner memberInner = memberOuter.new MemberInner();
        memberInner.display();
    }
}
