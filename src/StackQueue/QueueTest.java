package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //System.out.println(q.element());
        System.out.println(q.peek());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.offer(9);
        q.add(11);
        q.remove(3);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.toString());
    }
}
