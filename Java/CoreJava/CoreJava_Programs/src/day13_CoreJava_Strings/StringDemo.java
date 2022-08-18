package day13_CoreJava_Strings;

public class StringDemo {
    public static void main(String[] args) {
        //way 1
        String firstName = "coditas";
        //way 2
        String lastName = "ELTP";
        System.out.println("name of firm is :: "+firstName+" "+lastName);

        //imutability
        //firstName = firstName.concat("plp");
        System.out.println(firstName);
        System.out.println("name of firm is :: "+firstName+" "+lastName);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        String firmName = new String("coditas") ;
        String firmNameNew = "doditas";
        //Equality
        //way 1
        System.out.println(firmName.equals(firmName));
        System.out.println(firmName.equals(firmNameNew));
        System.out.println(firmName == firstName); //it will check the content type as well
        System.out.println(firmNameNew == firstName); //it will check the content type as well
        System.out.println(firmName.contentEquals(firstName));
        //compare to will give the output in interger and it will give the output as 0 if both the string are exact same
        System.out.println(firmName.compareTo(firstName));
        System.out.println(firstName.compareTo(firmNameNew));
    }
}
