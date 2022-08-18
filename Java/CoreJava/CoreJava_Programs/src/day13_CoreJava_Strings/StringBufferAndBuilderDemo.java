package day13_CoreJava_Strings;

public class StringBufferAndBuilderDemo {
    public static void main(String[] args) {
        String name = "coditas";
        StringBuffer stringBuffer = new StringBuffer("coditas");
        //concat
        name.concat("eltp");
        System.out.println(name);
        System.out.println("-------------------------stringbuffer-------------------------------------");
        stringBuffer.append("eltp");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.insert(3,"- this is reverse -");
        System.out.println(stringBuffer);
        StringBuffer intern = new StringBuffer();
        StringBuffer intern1 = new StringBuffer("BatchTwo");
        System.out.println("capacity of enpty string buffer : "+intern.capacity());
        System.out.println("capacity of initialize string buffer : "+intern1.capacity());
        intern1.ensureCapacity(51);
        System.out.println(intern1.capacity());

    }
}
