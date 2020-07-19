package DP;

import java.util.Scanner;

public class LongestCommonSubseq
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-- > 0)
        {
            int p=sc.nextInt();             // Take size of both the strings as input
            int q=sc.nextInt();
            int[][] arr=new int[p+1][q+1];
            String s1=sc.next();            // Take both the string as input
            String s2=sc.next();
            for(int row=p;row>=0;row--)
            {    // Top down approach
                for(int col=q;col>=0;col--)
                {
                    if(row==p || col==q)
                    {   // If i or j is equal to their size, continue
                        continue;
                    }
                    if(s1.charAt(row)==s2.charAt(col))
                    {         // If the char in both strings are equal
                        arr[row][col]=arr[row+1][col+1]+1;      // Add 1 to the output we got without including these both chars.
                    }
                    else
                        {
                            arr[row][col]=Math.max(arr[row+1][col],arr[row][col+1]); // If s1[i-1]!=s2[j-1], check the max output which comes from s1 or s2 without current char considering.
                        }
                }
            }
            System.out.println(arr[0][0]);  // Output the answer of dp[0][0]
        }
    }
}
/*
Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.

Input:
First line of the input contains no of test cases  T,the T test cases follow.
Each test case consist of 2 space separated integers A and B denoting the size of string str1 and str2 respectively
The next two lines contains the 2 string str1 and str2 .

Output:
For each test case print the length of longest  common subsequence of the two strings .

Constraints:
1<=T<=200
1<=size(str1),size(str2)<=100

Example:
Input:
2
6 6
ABCDGH
AEDFHR
3 2
ABC
AC

Output:
3
2

Explanation
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.

LCS of "ABC" and "AC" is "AC" of length 2
 */