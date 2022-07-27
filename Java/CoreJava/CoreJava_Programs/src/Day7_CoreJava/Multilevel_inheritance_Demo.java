package Day7_CoreJava;
class RajKapoor{
    int pan_id = 2121;
    public void display(){
        System.out.println("Details of Grandparent is: " + pan_id);
    }
}
class Randheer_kapoor extends RajKapoor{
    int pan_id = 87687;
    String name  = "Randheer";
    public void display(){
        super.display();
        System.out.println("Details of parent is:  Pan_id " + pan_id + " Name: " + name);
    }
}
class Kareena_kapoor extends Randheer_kapoor{
    int pan_id = 87678;
    String name  = "Kareena";
    int aadhar = 8979;
    public void display(){
        super.display();
        System.out.println("Details of Child is: Pan_id " + pan_id + " Name: " + name + " Aadhar_id "+ aadhar );
    }
}
public class Multilevel_inheritance_Demo {
    public static void main(String[] args) {
        Kareena_kapoor rk = new Kareena_kapoor();
        rk.display();
    }
}
/*"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=65350:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\Desktop\Java_Assignment\Java\CoreJava\CoreJava_Programs\out\production\CoreJava_Programs" Day7_CoreJava.Multilevel_inheritance_Demo
Details of Grandparent is: 2121
Details of parent is:  Pan_id 87687 Name: Randheer
Details of Child is: Pan_id 87678 Name: Kareena Aadhar_id 8979
Process finished with exit code 0
*/