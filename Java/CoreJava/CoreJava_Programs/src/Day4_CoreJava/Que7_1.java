package Day4_CoreJava;
class Print_Data{
    public static void display(){
        String [] week_Days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (String s :week_Days){
            if(s == "Thursday")
                continue;
            System.out.println(s);
        }
    }
}
public class Que7_1 {
    public static void main(String[] args) {
        Print_Data.display();
    }
}
