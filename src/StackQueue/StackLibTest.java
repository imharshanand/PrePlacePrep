package StackQueue;

import java.util.Stack;

public class StackLibTest {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(11);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(7);
        s.push(9);
        s.add(1, 99);
        System.out.println(s.contains(99));

        // s.search(val); It determines whether an object exists in the stack.
        // If the element is found, it returns the position of the element from the top of the stack.
        // Else, it returns -1.

        System.out.println(s.search(11));
        System.out.println("SIZE: "+s.size());
        System.out.println("CAPACITY: "+s.capacity()); // Increases as 10, 20, ...
        System.out.println("STACK: "+s.toString());
    }
}
