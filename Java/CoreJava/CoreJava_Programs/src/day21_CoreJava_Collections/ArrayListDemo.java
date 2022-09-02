package day21_CoreJava_Collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //three ways to create ArrayList (3 type of constructor)
        List arrayList1 = new ArrayList<>(); //this will hold only integer type data
        ArrayList<Integer> arrayList2 = new ArrayList<>();//this take as a collection object as a parameter
        ArrayList<Object> arrayList3 = new ArrayList<>(2);//this takes the initial capacity of arraylist
        arrayList3.add(10);
        arrayList3.add(20);
        arrayList1.add(10);
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);//add elements in arraylist
        arrayList1.add(2,100);//add 100 at 2 index in arraylist
        arrayList2.addAll(arrayList1);//add all element of arraylist1 into arraylist2
        System.out.println("arraylist 1 is : "+arrayList1);//print arraylist 1
        System.out.println("arraylist 2 is : "+arrayList2);//print arraylist 2
        System.out.println("arraylist 3 is : "+arrayList3);//print arraylist 3
        System.out.println("is arraylist 1 empty : "+arrayList1.isEmpty());//give boolean value and tells wheather arraylist is empty or not
        System.out.println("what is index of 100 in arraylist1 : "+arrayList1.indexOf(100));//gives index of 100 in arraylist1
        System.out.println("does arraylist 1 contain 20 : "+arrayList1.contains(20));//gives boolean value and tells wheather arraylist1 contains 20 or not
        System.out.println("element at index 1 in arraylist1 is : "+arrayList1.get(1));//returns element at given index
        System.out.println("set 200 at the 2 index of arraylist1 and return the old element present on that index : "+arrayList1.set(2,200));//set 200 at the 2 index of arraylist1 and return the old element present on that index
        System.out.println("what is last index of 20 : "+arrayList1.lastIndexOf(20));//returns last index of 20
        System.out.println("remove and return the element at 2 index : "+arrayList1.remove(2));//remove and return the element at 2 index
        System.out.println("return the size of arraylist : "+arrayList1.size());//return the size of arraylist
        System.out.println("only keep the same elements as of arraylist3 and remove all remaining elements from the arraylist1 : "+arrayList1.retainAll(arrayList3));//only keep the same elements as of arraylist3 and remove all remaining elements from the arraylist1
        System.out.println("remove all the same elements of arraylist2 from arraylist 3 : "+arrayList3.removeAll(arrayList2));//remove all the same elements of arraylist2 from arraylist 3
        System.out.println("--------------------------------------------updated list data after the operations----------------------------------------");
        System.out.println("arraylist 1 is : "+arrayList1);
        System.out.println("arraylist 2 is : "+arrayList2);
        System.out.println("arraylist 3 is : "+arrayList3);
        System.out.println("------------------------------------------WAYS TO ITTRATE THROUGH ARRAYLIST-------------------------------------------------------");
        System.out.println("------------------------way 1 by for each loop---------------");
        for (int i : arrayList2){
            System.out.print(i+", "); //way 1 by for each loop
        }
        System.out.println();
        System.out.println("---------------------way 2 by for loop---------------------");
        for (int i = 0; i < arrayList2.size(); i++) {          //way 2 by for loop
            System.out.print(arrayList2.get(i)+", ");
        }
        System.out.println();
        System.out.println("----------------------------way 3 by ittrator__________________________");
        Iterator it = arrayList2.iterator();
        while(it.hasNext()){            //way 3 by ittrator
            System.out.print(it.next()+", ");
        }
        System.out.println("----------------------------way 4 by lambda expression__________________________");
    arrayList2.forEach((a)-> System.out.print(a));//way 4 by lambda expression
    }
}
/*
===>Arraylist can have duplicate elements
===>Arraylist store the data in the insertion order
===>Arraylist allows null values
===>default size is 10 and increase according to need by 50%
 */