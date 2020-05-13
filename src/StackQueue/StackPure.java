package StackQueue;

import java.util.Iterator;
import java.util.Stack;

public class StackPure
{
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(15);
        s.push(4);
        s.push(5);
        print(s);
        System.out.println(s.empty());
        System.out.println(s.isEmpty());
        System.out.println(s.search(15));
    }
    public static void print(Stack<Integer> s)
    {
        Iterator it = s.iterator();
        while(it.hasNext())
        {
            int i = (int)it.next();
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
