package LinkedListProblems;
public class LL
{
    Node head;
    Node tail;
    public static class Node
    {
        Node(int val)
        {
            this.val = val;
        }
        int val;
        Node next;
    }
    public void addNode(int val)
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display()
    {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        LL ll = new LL();
        Node h = ll.head;

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);

        ll.display();
    }
}
