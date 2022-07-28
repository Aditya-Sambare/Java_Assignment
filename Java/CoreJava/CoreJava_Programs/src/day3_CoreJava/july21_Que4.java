package day3_CoreJava;
class Addition_Of_Variables_Same_Datatypes {

    public static void additionOfInt()
    {
        int int_Var1 = 20;
        int int_Var2 = 40;
        //addition of integer variables
        System.out.println("addition of integer variables");
        int int_Sum = int_Var1 + int_Var2;
        System.out.println(int_Sum);
    }

    public static void additionOfShort(){
        short short_Var1 = 20;
        short short_Var2 = 40;

        //addition of short variables gives an int variable
        System.out.println("addition of short variables gives an int variable");
        int short_Sum = short_Var1 + short_Var2;
        System.out.println(short_Sum);
    }

    public static void additionOfLong(){
        long long_Var1 = 20;
        long long_Var2 = 40;

        //addition two long variables
        System.out.println("addition two long variables");
        long long_Sum = long_Var1 + long_Var2;
        System.out.println(long_Sum);
    }

    public static void additionOfFloat(){
        float float_Var1 = 20;
        float float_Var2 = 40;

        //addition two float variables
        System.out.println("addition two float variables");
        float float_Sum = float_Var1 + float_Var2;
        System.out.println(float_Sum);
    }
    public static void additionOfDouble(){
        double double_Var1 = 20;
        double double_Var2 = 40;

        //addition two double variables
        double double_Sum = double_Var1 + double_Var2;
        System.out.println("addition two double variables");
        System.out.println(double_Sum);
    }

    public static void additionOfByte(){
        byte byte_Var1 = 1;
        byte byte_Var2 = 1;

        //adding two byte variable gives int, hence we need to typecast it to byte
        System.out.println("adding two byte variable gives int, hence we need to typecast it to byte");
        byte byte_Sum = (byte)(byte_Var1 + byte_Var2);
        System.out.println(byte_Sum);
    }

    public static void additionOfChar(){
        char char_Var1 = 'a';
        char char_Var2 = 'b';

        //addition of two char variables adds ascii values and it gives int
        //we need to typecast it to char
        System.out.println("addition of two char variables adds ascii values and it gives int we need to typecast it to char");
        char char_Sum = (char)(char_Var1 + char_Var2);
        System.out.println(char_Sum);
    }


    public static void additionOfBoolean(){
        boolean boolean_Var1 = true;
        boolean boolean_Var2 = false;
        System.out.println("boolean value can not be added");

        //boolean value cannot be added
        //boolean boolean_Sum = boolean_Var1 + boolean_Var2;
        //System.out.println(boolean_Sum);
    }
}
public class july21_Que4 {
        public static void main(String[] args) {
        Addition_Of_Variables_Same_Datatypes.additionOfChar();
        Addition_Of_Variables_Same_Datatypes.additionOfByte();
        Addition_Of_Variables_Same_Datatypes.additionOfDouble();
        Addition_Of_Variables_Same_Datatypes.additionOfFloat();
        Addition_Of_Variables_Same_Datatypes.additionOfInt();
        Addition_Of_Variables_Same_Datatypes.additionOfLong();
        Addition_Of_Variables_Same_Datatypes.additionOfShort();
        Addition_Of_Variables_Same_Datatypes.additionOfBoolean();
    }

}
