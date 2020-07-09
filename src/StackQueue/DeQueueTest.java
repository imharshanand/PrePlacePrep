package StackQueue;


import java.util.Deque;
import java.util.LinkedList;

public class DeQueueTest {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(3);
        dq.push(4);
        dq.offer(6);
        dq.addFirst(2);
        dq.addLast(5);
        dq.addFirst(1);
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