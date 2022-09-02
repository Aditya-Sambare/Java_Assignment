package day21_CoreJava_Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(11);
        set.add(null);
        set.add(13);
        set.add(15);
        set.add(17);
        set.add(19);

        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(14);
        set1.add(16);
        set1.add(18);
        set1.add(20);
        set.addAll(set1);

        System.out.println("set count is "+set.size());
        System.out.println("is set empty "+set.isEmpty());
        System.out.println("do set cotain 11 "+set.contains(11));
        System.out.println("set count is "+set.size());

        //way 1 to access elements
        System.out.println("for each loop to access element");
        for(Integer i : set){
            System.out.println(i);
        }
//        //way 2 to access elements
//        System.out.println("toarray method and for loop to access element");
//        Object arr[]=set.toArray();
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//        //way 3 to access elements
//        System.out.println("iterartor to access element");
//        Iterator<Integer> it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//
        }
     }
/*
------------------------------------------------------
Hashset==>
order = unorderd
null = allowed
duplicate = not allowed
-------------------------------------------------------
LinkedHashset==>
order = insertion orderd
null = allowed
duplicate = not allowed
-------------------------------------------------------
Treeset==>
order = ascending order
null = not allowed
duplicate = not allowed
-------------------------------------------------------
 */