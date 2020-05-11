package String;

import java.sql.SQLType;
import java.util.Scanner;

/*
L: https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0
P: Given a string S, find the longest palindromic substring in S.
    Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
    Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.
    Incase of conflict, return the substring which occurs first ( with the least starting index ).
T: Longest Palindrome in a String
 */
public class LongPalindrome
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            String s = sc.next();
            System.out.println(longestPalindrome(s));
        }
    }

    public static String longestPalindrome(String s)
    {
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = i; j < n; j++)
            {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length()))
                {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
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