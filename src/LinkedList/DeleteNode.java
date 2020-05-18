package LinkedList;

import java.util.Scanner;

public class DeleteNode
{

}
/**
P: 237. Delete Node in a Linked List
L: https://leetcode.com/problems/delete-node-in-a-linked-list/
E: Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 */

/**
public void deleteNode(ListNode node)
{
    node.val = node.next.val;
    node.next = node.next.next;
}
 */