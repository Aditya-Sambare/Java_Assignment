package Day4_CoreJava;
class Calculator{
    String operation = "Division";
    public void calculatorOperation(){
        switch(operation){
            case "Addition":
                System.out.println("this is addition");
                break;

            case "Subtraction":
                System.out.println("this is Subtraction");
                break;

            case "Division":
                System.out.println("this is Division");
                break;

            case "Multiplication":
                System.out.println("this is Multiplication");
                break;

            default:
                System.out.println("select any of the operation:+,_,*,/");
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculatorOperation();
        //Example of for each loop.
        int[] marks={100,120,140,150,200};
        for (int num : marks){
            System.out.println(num);
        }

    }

}
