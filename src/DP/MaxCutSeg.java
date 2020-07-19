package DP;
// https://practice.geeksforgeeks.org/problems/cutted-segments/0
// Maximize The Cut Segments

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxCutSeg {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n;
            n=sc.nextInt();
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            System.out.println(RodCut(n,x,y,z));
        }
    }
    private static int RodCut(int n,int x,int y,int z)
    {
        //dp
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            dp[i]=-1;
            if(i>=x)
                dp[i]=Math.max(dp[i],dp[i-x]);
            if(i>=y)
                dp[i]=Math.max(dp[i],dp[i-y]);
            if(i>=z)
                dp[i]=Math.max(dp[i],dp[i-z]);
            if(dp[i]!=-1)
                dp[i]+=1;
        }
        return dp[n];
    }
}
/*
Given an integer N denoting the Length of a line segment. you need to cut the line segment in such a way that the cut length of a line segment each time is integer either x , y or z. and after performing all cutting operation the total number of cutted segments must be maximum.


Input
First line of input contains of an integer 'T' denoting number of test cases. First line of each testcase contains N . Second line of each testcase contains 3 space separated integers x , y and z.

Output
For each test case print in a new line an integer corresponding to the answer .


Constraints
1<=t<=70
1<=N,x,y,z<=4000


Example

Input

2
4
2 1 1
5
5 3 2


Output
4
2

In first test case, total length is 4, and cut lengths are 2, 1 and 1.  We can make maximum 4 segments each of length 1. In secon test case, we can make two segments of lengths 3 and 2.
 */