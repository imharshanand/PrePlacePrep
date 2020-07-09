package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class PushOfferAdd {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //q.push(1); XX stack.push(1);
        q.offer(1);
        q.offer(4);
        q.offer(3);
        q.offer(9);
        q.offer(5);

        q.remove(9);

        int l = q.size();
        System.out.println("Size: "+q.size());
        System.out.println("Peeking: "+ q.peek());

        for(int i=0; i<l; i++) {
            System.out.println(q.poll());
        }
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
