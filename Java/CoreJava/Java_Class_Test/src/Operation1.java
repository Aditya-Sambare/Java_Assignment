public class Operation1 {
    public Student[] students = new Student[15];
    static int index = 0;

    void insert( int id , String firstName,String lastName,String city,String techStack,String mobileNumber ) {
        students[index] = new Student(id, firstName, lastName, city, techStack, mobileNumber);
        index++;
    }

    void displayRecords() {
        for (Student student1 : students) {
            if(student1 != null){
                System.out.println(student1.toString());
//            System.out.println("Student id is " + student1.id+"\nfirst name is "+student1.firstName+"\nlast name is "+student1.lastName+"\ncity is "+student1.city+"\ntechstack is "+student1.techStack+"\nmobile number is "+student1.mobileNumber);
        }
        }
    }
    void removeRecord(int id){
        for (Student student1 : students){
            if(student1 != null){
            if(student1.id==id){
                student1.firstName=null;
                student1.id=0;
                student1.city=null;
                student1.mobileNumber=null;
                student1.lastName=null;
                student1.techStack=null;
            }
        }else{
                break;
            }
        }
    }
    void update( int id , String firstName,String lastName,String city,String techStack,String mobileNumber ){
        for (Student student1 : students){
            if(student1.id==id){
                student1.id=id;
                student1.firstName=firstName;
                student1.lastName=lastName;
                student1.city=city;
                student1.techStack=techStack;
                student1.mobileNumber=mobileNumber;
                break;
            }
        }
    }
}