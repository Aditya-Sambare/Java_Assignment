package day13_CoreJava;

import java.util.StringTokenizer;

/**
 * 7)Separate the tokens(operands and operators) from below statement:
 *  * 3+(2062) (20/2)
 *  * Case 1)Print separated tokens
 *  * Case 2)Print Operators and Operand separately
 */
class Tokens{
    void tokens() {
        StringTokenizer stringTokenizer = new StringTokenizer("3+(2062) (20/2)", " ");
        System.out.println("seprated tokens are : ");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer1 = new StringTokenizer("3+(2062) (20/2)", "+()/*- ");
        System.out.println("seprated operands  are : ");
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.println(stringTokenizer1.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer("3+(2062) (20/2)", "0123456789");
        System.out.println("seprated operators are : ");
        while (stringTokenizer2.hasMoreTokens()) {
            System.out.println(stringTokenizer2.nextToken());
        }
    }
}
public class Que7_SeparateTheTokens {
    public static void main(String[] args) {
        Tokens tokens = new Tokens();
        tokens.tokens();
    }
}
/*
output is
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52684:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\Desktop\Java_Assignment\Java\CoreJava\CoreJava_Programs\out\production\CoreJava_Programs" day13_CoreJava.Que7_SeparateTheTokens
seprated tokens are :
3+(2062)
(20/2)
seprated operands  are :
3
2062
20
2
seprated operators are :
+(
)
(
/
)

Process finished with exit code 0

 */