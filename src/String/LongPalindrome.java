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
        String res = "";
        int palindromeStartsAt = 0, maxLen = 0;

        boolean[][] dp = new boolean[n][n];
        // dp[i][j] indicates whether substring s starting at index i and ending at j is palindrome

        for(int i = n-1; i >= 0; i--)
        { // keep increasing the possible palindrome string
            for(int j = i; j < n; j++) // find the max palindrome within this window of (i,j)
            {
                //check if substring between (i,j) is palindrome
                dp[i][j] = (s.charAt(i) == s.charAt(j)) // chars at i and j should match
                        &&
                        ( j-i < 3  // if window is less than or equal to 3, just end chars should match
                                || dp[i+1][j-1]  ); // if window is > 3, substring (i+1, j-1) should be palindrome too

                //update max palindrome string
                if(dp[i][j] && (j-i+1 > maxLen))
                {
                    palindromeStartsAt = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt+maxLen);
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