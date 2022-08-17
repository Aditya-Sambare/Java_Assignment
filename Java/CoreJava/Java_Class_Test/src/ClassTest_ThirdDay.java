import java.io.*;

class CaseOne{
    void caseOneDemo() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Name.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream("File1.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("File2.txt");
        FileOutputStream fileOutputStream3 = new FileOutputStream("File3.txt");
        FileOutputStream fileOutputStream4 = new FileOutputStream("File4.txt");
        String str1 = "hii i am aditya";
        String str2 = "i love my self";
        String str3 = "i am confident";
        fileOutputStream.write(str1.getBytes());
        fileOutputStream.write(str2.getBytes());
        fileOutputStream.write(str3.getBytes());
        FileInputStream fileInputStream = new FileInputStream("Name.txt");
        File file = new File("Name.txt");
        System.out.println(file.exists());
        while(true){
        int i = fileInputStream.read();
            System.out.print((char)i);
            if (i == -1){
                break;
            }
            fileOutputStream1.write(i);
            fileOutputStream2.write(i);
            fileOutputStream3.write(i);
            fileOutputStream4.write(i);
    }}
}
//you have to accept
public class ClassTest_ThirdDay {
    public static void main(String[] args) throws IOException {
        CaseOne caseOne = new CaseOne();
        caseOne.caseOneDemo();
    }
}
