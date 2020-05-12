package String;

import java.util.Scanner;

/*
L: https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0
P: Given a string S, find the longest palindromic substring in S.
    Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
    Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.
    Incase of conflict, return the substring which occurs first ( with the least starting index ).
T: Longest Palindrome in a Strin
 */
public class LongPalindrome2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestPalindrome(s));
    }
    public static String  longestPalindrome(String s)
    {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++)
        {
            //StringBuffer sb = new StringBuffer();
            //sb.append(s.charAt[i]);
            char c = s.charAt(i);
            int left = i;
            int right = i;

            while (left >= 0 && s.charAt(left) == c)
            {
                left--;
            }

            while (right < s.length() && s.charAt(right) == c)
            {
                right++;
            }

            while (left >= 0 && right < s.length())
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    break;
                }
                left--;
                right++;
            }

            // left + 1 and right - 1 are actually the start and end index of the Palindromic string
            // we don't set "right" because String.substring function required end index exclusively
            left = left + 1;
            if (end - start < right - left)
            {
                start = left;
                end = right;
            }
        }
        return s.substring(start, end);
    }
}
/*
Input:
The first line of input consists number of the testcases. The following T lines consist of a string each.

Output:
In each separate line print the longest palindrome of the string given in the respective test case.

Constraints:
1 ≤ T ≤ 100
1 ≤ Str Length ≤ 104

Example:
Input:
1
aaaabbaa

Output:
aabbaa
 */
/*
Every palindrome is basically a mirror image around a central character.
For example , "anana" is a mirror with the center "a" .
Also, a palindrome could have two characters at their center instead of just one.
For example, in the palindrome "abba" , the center is "bb" .
Using these facts, we can write an expand function,
that will return the longest possible palindrome with each character
in the string as the center for a possible palindrome.
 */