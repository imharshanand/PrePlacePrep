package DP;


import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestCommonSuperseq
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(lcs(str1, str2));
        }
    }

    public static int lcs(String s1, String s2)
    {
        int[][] strg = new int[s1.length() + 1][s2.length() + 1];
        strg[s1.length()][s2.length()] = 0;

        for (int i = s1.length(); i >= 0; i--)
        {
            for (int j = s2.length(); j >= 0; j--)
            {
                if (i == s1.length() || j == s2.length())
                {
                    strg[i][j] = 0;
                    continue;
                }
                if (s1.charAt(i) == s2.charAt(j))
                {
                    strg[i][j] = 1 + strg[i + 1][j + 1];
                }
                else {
                    strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
                }
            }
        }
        int res = strg[0][0];
        int ans = 0;
        ans = s1.length() + s2.length() - res;
        return ans;
    }
}
/*
https://practice.geeksforgeeks.org/problems/shortest-common-supersequence/0
Shortest Common Super sequence

Given two strings str1 and str2, find the length of the smallest string which has both, str1 and str2 as its sub-sequences.
Note: str1 and str2 can have both uppercase and lowercase letters.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains two space-separated strings.

Output:
For each testcase, in a new line, output the length of the required string.

Expected Time Complexity: O(Length(str1) * Length(str2)).
Expected Auxiliary Space: O(Length(str1) * Length(str2)).

Constraints:
1 <= T <= 100
1<= |str1|, |str2| <= 100

Example:
Input:
2
abcd xycd
efgh jghi
Output:
6
6
Explanation:
Test Case 1: One of the shortest answer can be abxycd, which is of length 6.
 */