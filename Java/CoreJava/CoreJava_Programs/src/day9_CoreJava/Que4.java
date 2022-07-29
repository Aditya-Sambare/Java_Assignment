package day9_CoreJava;
/**
 * 5)Write a program for Addition operation,
 * Class Addition
 * /add method overloading for add
 * Class Varargs_Addition{
 * //use varargs for add method
 * Class MainApplication
 * //access above classes in mainO
 */
class Addition{
    void add(int a , int b){
        int sum = a + b;
        System.out.println("sum is :: "+sum);
    }
    void add(int a , int b , int c){
        int sum = a + b + c;
        System.out.println("sum is :: "+sum);
    }
}
class VarArgs_Addition{
    void add(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println("sum is :: "+sum);
    }
}
public class Que4 {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(10,20,30);
        addition.add(10,90);
        VarArgs_Addition varArgs_addition = new VarArgs_Addition();
        varArgs_addition.add(10,20,30,40,50,60);

    }
}
/*
output is
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=50988:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\Desktop\Java_Assignment\Java\CoreJava\CoreJava_Programs\out\production\CoreJava_Programs" day9_CoreJava.Que4
sum is :: 60
sum is :: 100
sum is :: 210

Process finished with exit code 0

 */