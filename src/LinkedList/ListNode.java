package LinkedList;

import java.util.Iterator;
import java.util.Stack;

public class ListNode
{

    int val;
    ListNode next;

    ListNode()
    {

    }
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

class TEST
{
    public static void main(String args[])
    {
        ListNode head = new ListNode(0);
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
        ListNode h = head;
        for(int i=0; i<5; i++)
        {
            ListNode store = new ListNode();
            store.val = i;
            head.next = store;
            head = head.next;
        }

        Stack<Integer> stack = new Stack<Integer>();

        while(h != null)
        {
            System.out.print(h.val);
            stack.push(h.val);
            h = h.next;
        }
//        System.out.println();
//        while(!stack.isEmpty())
//        {
//            System.out.print(stack.pop());
//        }
    }
}
/*
 Definition for singly-linked list.
 */