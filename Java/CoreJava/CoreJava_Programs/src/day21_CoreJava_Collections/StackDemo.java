package day21_CoreJava_Collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(10);
        stack.add(11);
        stack.add(12);//add the elements in stack
        stack.add(9);
        stack.push(8);
        stack.push(13);//push the elements in stack
        stack.add(2,200);//add 200 at 2 index
        System.out.println("peek element in stack is : "+stack.peek());//returns the top most element
        System.out.println("is stack empty : "+stack.empty());//give boolean value wheather the stack is empty or not
        System.out.println("stack size is : "+stack.size());//return the size of stack
        System.out.println("stack is : "+stack);//print the complete stack
        System.out.println("poped element is : "+stack.pop());//pop the top element and returns it
        System.out.println("stack is : "+stack);//print the complete stack
    }
}
