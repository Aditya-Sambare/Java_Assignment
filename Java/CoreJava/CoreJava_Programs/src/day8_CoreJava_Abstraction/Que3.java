package day8_CoreJava_Abstraction;
import java.util.Random;
/**
 * 3). Create a class Medicine to represent a drug manufactured by a pharmaceutical
 * company. Provide a function displayLabel() in this class to print Name and address of
 * the company.
 * Derive Tablet, Syrup and Ointment classes from the Medicine class.
 * Override the displayLabel() function in each of these classes to print additional
 * information suitable to the type of medicine.
 * For example, in case of tablets, it could be "store in a cool dry place", in case of
 * ointments it could be "for external use only" ete. Create a class TestMedicine. Write
 * main function to do the following: Declare an array of Medicine references of size 10
 * Create a medicine object of the type as decided by a randomly generated integer in the
 * range 1 to 3. Refer Java API Documentation to find out random generation features.
 * Check the polymorphic behavior of the displayLabel() method.
 */
abstract class Medicine{
    void display_Label(){
        String name = "coditas pharma";
        String address = "viman nagar pune";
        System.out.println("************** Name of the company is : "+name+" and address is : "+address+" **********************");
    }
}
class Tablet extends Medicine{
    @Override
    void display_Label() {
        super.display_Label();
        System.out.println("----{This is Tablet store in a cool dry place } ----");
        System.out.println("the composition is dibasic calcium phosphate, sucrose, microcrystalline cellulose, povidone polyvinylpyrrolidone");
    }
}
class Syrup extends Medicine{
    @Override
    void display_Label() {
        super.display_Label();
        System.out.println("----{This is syrup keep away from children} ----");
        System.out.println("composition is Acetaminophen, 0.5 to 5g, Glycols 5 to 30g, Water soluble macromolecule 0.5 to 5g, Sweet saccharides 10 to 60g, Purified water");
    }
}
class Oinment extends Medicine{
    @Override
    void display_Label() {
        super.display_Label();
        System.out.println("---{This is oinment for external use only}----");
        System.out.println("the composition is Macrogol 1000 Macrogol 1500 Macrogol 3350 Macrogol 400 Purified water Sodium bicarbonate");
    }
}
class TestMedicine {
    public void test() {
        Random random = new Random();
        Medicine medicine[];
        medicine = new Medicine[10];
        for (int i = 0; i < 10; i++) {
            int random_int = random.nextInt(3);
            switch (random_int) {
                case 0:
                    medicine[i] = new Syrup();
                    break;
                case 1:
                    medicine[i] = new Oinment();
                    break;
                case 2:
                    medicine[i] = new Tablet();
                    break;
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.println("========================================================================================================================");
            medicine[i].display_Label();
        }
    }
}
public class Que3 {
    public static void main(String[] args) {
//        Medicine.display_Label();
        TestMedicine testMedicine = new TestMedicine();
        testMedicine.test();
    }
}
/*
out put is
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is Tablet store in a cool dry place } ----
the composition is dibasic calcium phosphate, sucrose, microcrystalline cellulose, povidone polyvinylpyrrolidone
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is Tablet store in a cool dry place } ----
the composition is dibasic calcium phosphate, sucrose, microcrystalline cellulose, povidone polyvinylpyrrolidone
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
---{This is oinment for external use only}----
the composition is Macrogol 1000 Macrogol 1500 Macrogol 3350 Macrogol 400 Purified water Sodium bicarbonate
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is Tablet store in a cool dry place } ----
the composition is dibasic calcium phosphate, sucrose, microcrystalline cellulose, povidone polyvinylpyrrolidone
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
---{This is oinment for external use only}----
the composition is Macrogol 1000 Macrogol 1500 Macrogol 3350 Macrogol 400 Purified water Sodium bicarbonate
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is syrup keep away from children} ----
composition is Acetaminophen, 0.5 to 5g, Glycols 5 to 30g, Water soluble macromolecule 0.5 to 5g, Sweet saccharides 10 to 60g, Purified water
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is syrup keep away from children} ----
composition is Acetaminophen, 0.5 to 5g, Glycols 5 to 30g, Water soluble macromolecule 0.5 to 5g, Sweet saccharides 10 to 60g, Purified water
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
---{This is oinment for external use only}----
the composition is Macrogol 1000 Macrogol 1500 Macrogol 3350 Macrogol 400 Purified water Sodium bicarbonate
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is Tablet store in a cool dry place } ----
the composition is dibasic calcium phosphate, sucrose, microcrystalline cellulose, povidone polyvinylpyrrolidone
========================================================================================================================
************** Name of the company is : coditas pharma and address is : viman nagar pune **********************
----{This is syrup keep away from children} ----
composition is Acetaminophen, 0.5 to 5g, Glycols 5 to 30g, Water soluble macromolecule 0.5 to 5g, Sweet saccharides 10 to 60g, Purified water

Process finished with exit code 0

 */

