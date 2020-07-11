package StackQueue;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueueTest {
    public static void main(String[] args) {
//        Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        System.out.println(dq.poll());
        dq.add(3);
        dq.push(4);
        dq.offer(6);
        dq.addFirst(2);
        dq.addLast(5);
        dq.addFirst(1);
        dq.add(11);
        System.out.println(dq.getFirst());
        System.out.println(dq.contains(11));

        System.out.println("ArrayDeque: " + dq.toString());
//        Iterator it = dq.iterator();
//        while(it.hasNext())
//            System.out.print(it.next());

//        System.out.println(dq.poll()); //Returning null + removing operations
//        System.out.println("ArrayDeque: " + dq.toString());
//        System.out.println(dq.pop()); //Throwing exception + removing operations
//        System.out.println("ArrayDeque: " + dq.toString());
        System.out.println(dq.remove());
        System.out.println("ArrayDeque: " + dq.toString());
    }
}
/*
// Add 3 at the tail of this deque
arrayDeque.add(3); -> [3]
// Add 4 at the head of this deque
arrayDeque.push(4); -> [4, 3]
// Add 6 at the tail of this deque
arrayDeque.offer(6); -> [4, 3, 6]
// Add 2 at the head of this deque
arrayDeque.addFirst(2); -> [2, 4, 3, 6]
// Add 5 at the tail of this deque
arrayDeque.addLast(5); -> [2, 4, 3, 6, 5]
// Add 1 at the head of this deque
arrayDeque.addFirst(1); -> [1, 2, 4, 3, 6, 5]
 */