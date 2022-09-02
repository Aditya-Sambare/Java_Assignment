package day21_CoreJava_Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(1,100);
        List list = new LinkedList(linkedList);
        list.add(10);
        list.add(20);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        List list2 = new LinkedList();
        list2.addAll(list);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.get(1));
        System.out.println(list2.containsAll(list));
        System.out.println(linkedList.retainAll(list));
        System.out.println(list.removeAll(linkedList));
    }
}
