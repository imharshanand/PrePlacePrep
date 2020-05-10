package Arrays;
/*
T: Given an unsorted array A of size N of non-negative integers,
find a continuous sub-array which adds to a given number S.
L: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarraySum
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int csum=0,header=0,flag=0;
            for(int j=0;j<n;j++)
            {
                csum+=arr[j];
                while(csum>sum)

                {
                    csum=csum-arr[header];
                    header++;
                }
                if(csum==sum)
                {
                    flag=1;
                    System.out.println((header+1)+" "+(j+1));
                    break;

                }
            }
            if(flag==0)
                System.out.println(-1);

        }
    }
}
/*
Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of two lines.
The first line of each test case is N and S, where N is the size of array and S is the sum.
The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing)
of first such occuring subarray from the left if sum equals to subarray, else print -1.

Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5
 */