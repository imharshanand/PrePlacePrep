package LinkedList;

public class ReverseLL {
}
//Method 2:
//  Runtime: 1 ms, faster than 7.20% of Java online submissions for Reverse Linked List.
//  Memory Usage: 39.1 MB, less than 5.04% of Java online submissions for Reverse Linked List.
/**
public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        Stack<Integer> l = new Stack<Integer>();
        while(head != null)
        {
            l.add(head.val);
            head = head.next;
        }
        ListNode store = new ListNode();
        ListNode n = new ListNode();

        if(!l.isEmpty())
        {
            ListNode n1 = new ListNode(l.pop());
            store = n1;
            n = store;
        }
        while(!l.isEmpty())
        {
            ListNode n2 = new ListNode(l.pop());
            store.next = n2;
            store = store.next;
        }

        return n;
    }
 */
//Method 1:
//  Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//  Memory Usage: 39.3 MB, less than 5.04% of Java online submissions for Reverse Linked List.
/**
public ListNode reverseList(ListNode head)
{
        if(head==null) return head;
        ListNode prev = null;
        ListNode cur_node = head;
        while(cur_node != null)
        {
            ListNode next_node = cur_node.next;
            cur_node.next = prev;
            prev = cur_node;
            cur_node = next_node;
        }
        return prev;
 }
 */
 
 /*
     public ListNode reverseList(ListNode head) {
    if (head == null)
        return null;

    ListNode    node = head,
                prev = null,
                reversed = null;

    while (node != null)
    {
        final ListNode next = node.next;

        if (node.next == null)
            reversed = node;

        node.next = prev;
        prev = node;
        node = next;
    }

    return reversed;
}
 */