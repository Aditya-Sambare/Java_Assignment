package day21_CoreJava_Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(12,"B");
        map.put(14,"D");
        map.put(16,"F");
        map.put(18,"H");
        map.put(20,"J");
        map.put(null,"l");
        map.put(null,"n");
        map.put(14,null);

        Map<Integer , String> map1 = new HashMap<>();
        map1.put(11,"A");
        map1.put(13,"C");
        map1.put(15,"E");
        map1.put(17,"G");
        map1.put(19,"I");

        map.putAll(map1);
        System.out.println("value at 14 key is : "+map.get(14));
        System.out.println("map contains 50 key or not :"+map.containsKey(50));
        System.out.println("map contains A value or not :"+map.containsValue("A"));
        //check wheather key is present in a map or not
        if(!map.containsKey(22)){
            map.put(22,"jj");
        }
        //check wheather key is present in a map or not
        map.putIfAbsent(33,"mm");
        //way to access map
        for (Map.Entry m : map.entrySet()){
            System.out.println(m);
        }
    }
}
/*
------------------------------------------------------
HashMap==>
order = unorderd
null = allowed
duplicate = not allowed
------------------------------------------------------
LinkedHashmap==>
order = insertion orderd
null = allowed
duplicate = not allowed
-------------------------------------------------------
TreeMap==>
order = ascending order
null = not allowed
duplicate = not allowed
-------------------------------------------------------

 */