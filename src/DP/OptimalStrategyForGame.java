package DP;

import java.lang.*;
import java.io.*;
import java.util.*;

public class OptimalStrategyForGame {
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=s.nextInt();
            }
            System.out.println(max(arr));
        }
    }

    public static int max(int[] arr)
    {
        int n=arr.length;
        if(n==0)
        {
            return 0;
        }
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i]=arr[i];
        }
        int counteri=n-1;
        int counterj=1;
        for(int col=counterj;col<n;col++)
        {
            int j=col;
            for(int i=0;i<counteri;i++)
            {
                int x=(i+1)<=(j-1)?dp[i+1][j-1]:0;
                int y=(i+2)<=j?dp[i+2][j]:0;
                int z=(i)<=(j-2)?dp[i][j-2]:0;
                dp[i][j]=Math.max(arr[i]+Math.min(x,y), arr[j]+Math.min(x,z));
                j++;
            }
            counterj++;
            counteri--;
        }
        return dp[0][n-1];
    }
}

/*
Optimal Strategy For A Game
https://practice.geeksforgeeks.org/problems/optimal-strategy-for-a-game/0

You are given an array A of size N. The array contains integers and is of even length. The elements of the array represent N coin of values V1, V2, ....Vn. You play against an opponent in an alternating way.

In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, and receives the value of the coin.

You need to determine the maximum possible amouint of money you can win if you go first.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains N denoting the size of the array. The second line contains N elements of the array.

Output:
For each test case, in a new line, print the maximum amout.

Constraints:
1 <= T <= 100
2 <= N <= 100
1 <= Ai <= 106

Examples:
Input:
2
4
5 3 7 10
4
8 15 3 7
Output:
15
22

Explanation:
Test case1: The user collects maximum value as 15(10 + 5)
Test case2: The user collects maximum value as 22(7 + 15)
 */