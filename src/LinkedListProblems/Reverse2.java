package LinkedListProblems;

public class Reverse2 {
}
/*
L: https://leetcode.com/problems/reverse-linked-list-ii/
P: Reverse a linked list from position m to n. Do it in one-pass.
E: Example:
        Input: 1->2->3->4->5->NULL, m = 2, n = 4
        Output: 1->4->3->2->5->NULL
 */
/**
public ListNode reverseBetween(ListNode head, int m, int n)
 {
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;

        while(m>1)
        {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }

        ListNode connection = prev;
        ListNode tail = curr;

        while(n>0)              //NCnPCN
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            n--;
        }

        if(connection != null)
            connection.next = prev;
        else
            head = prev;

        tail.next = curr;
        return head;
 }
 */
