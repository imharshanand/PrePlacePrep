package LinkedListProblems;

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
        for(int i=1; i<5; i++)
        {
            ListNode store = new ListNode();
            store.val = i;
            head.next = store;
            head = head.next;
        }
        reorderList(h);

        Stack<Integer> stack = new Stack<>();

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

    public static void reorderList(ListNode head)
    {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }
}
/*
 Definition for singly-linked list.
 */