package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- >0)
        {
            String s = sc.nextLine();
            HashSet<String> hset = new HashSet<>();
            for(int i=0; i<s.length(); i++)
                hset.add(s.substring(i,i+1));

            for(int i=0; i<s.length(); i++)
                if(hset.contains(s.substring(i,i+1)))
                {
                    System.out.print( s.substring(i,i+1) );
                    hset.remove(s.substring(i,i+1));
                }
        }
    }
}
/*
Given a string, the task is to remove duplicates from it. Expected time complexity O(n) where n is length of input string and extra space O(1) under the assumption that there are total 256 possible characters in a string.

Note: that original order of characters must be kept same.

Input:
First line of the input is the number of test cases T. And first line of test case contains a string.

Output:
Modified string without duplicates and same order of characters.

Constraints:
1 <= T <= 15
1 <= |string|<= 1000

Example:
Input:
2
geeksforgeeks
geeks for geeks

Output:
geksfor
geks for
 */