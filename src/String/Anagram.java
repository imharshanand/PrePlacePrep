package String;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char [] c1 = s.toCharArray();
        char [] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2))
            System.out.println("ANAGRAM");
        else
            System.out.println("Not ANALGRAM");

    }
}
/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 106

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO
 */
