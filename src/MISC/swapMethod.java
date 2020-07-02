package MISC;

import java.util.*;

public class swapMethod {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0); ll.add(1); ll.add(2); ll.add(3); ll.add(4); ll.add(5); ll.add(6);
        Collections.swap(ll, 0, 5);

        for(int i = 0; i < ll.size(); i++)
            System.out.println(ll.get(i));
    }
}
