package day10_August_01_Assignment;
class Student {
    int rollNo;
    String name;
    Float marks = 45.0f;

    public Student(int rollNo, String name, Float marks) { //constructor for the student class variables
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void greeting(){
        System.out.println("This is a greeting method :: hello my name is "+this.name);
    }
    void change_Name(String name){
        this.name = name;
    }

    public Student() {
       this(13,"Abhi",96.8f);
    }
}
public class Lecture1_Introduction {
    public static void main(String[] args) {
        Student aadi;
        aadi = new Student();
        aadi.name = "aadi sambare";
        aadi.rollNo = 21;
        aadi.marks = 89.0f;
        System.out.println("This is information of aadi :: name:"+aadi.name+", roll no:"+aadi.rollNo +", marks:"+aadi.marks);
        int [] numbers = new int[5]; //interger type array to store 5 numbers
        String [] names = new String[5]; //string type array to store 5 names

        Student student = new Student(10,"Aditya",98.3f);
        Student student1 = new Student(11,"Advait",97.9f);
        System.out.println("This is information of student :: name:"+ student.name+", roll no:" + student.rollNo +", marks:"+student.marks);
        System.out.println("This is information of student 1 :: name:" +student1.name+", roll no:"+ student1.rollNo +", marks:"+ student1.marks);
        student.greeting();
        student.change_Name("Arjun");
        System.out.println("This is information of student after changing name :: name:" + student.name+", roll no:"+ student.rollNo +", marks:"+student.marks);
        Student student2 = new Student();
        System.out.println("This is information of student 2 :: name:" +student2.name +", roll no:"+ student2.rollNo +", marks:"+ student2.marks);
        Student student_New1 = new Student();
        student_New1.name = "piyush";
        Student student_New2 = student_New1;
        System.out.println("This is Student new2 which we assigned by using student new1 and the name is :: name:"+student_New2.name);

    }
}
