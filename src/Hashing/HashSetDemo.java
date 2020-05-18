package Hashing;

import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String args[])
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(7);
        hs.add(3);
        hs.add(4);
        System.out.println(hs.contains(3));
        System.out.println(hs.contains(5));
    }
}
/**
boolean add(E e): Used to add the specified element if it is not present, if it is present then return false.

void clear(): Used to remove all the elements from set.

boolean contains(Object o): Used to return true if an element is present in set.

boolean remove(Object o): Used to remove the element if it is present in set.

Iterator iterator(): Used to return an iterator over the element in the set.

boolean isEmpty(): Used to check whether the set is empty or not. Returns true for empty and false for non-empty condition for set.

int size(): Used to return the size of the set.

Object clone(): Used to create a shallow copy of the set.
 */
