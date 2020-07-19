package DP;
//Maximum sum increasing subsequence

import java.util.Scanner;

public class MaxSumIncSubseq {
    static int a[] = new int[1000000];

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- >0)
        {
            long n = sc.nextLong();
            for(long i = 0; i < n; i++)
                a[(int)i] =sc.nextInt();

            int msis[] = new int[(int)n];
            for(long i = 0; i < n; i++)
            {
                msis[(int)i] =a[(int)i];
            }

            for(long i = 1; i < n; i++)
            {
                for(long j = 0; j < i; j++)
                {
                    if(a[(int)i] > a[(int)j] && msis[(int)i] < msis[(int)j]+a[(int)i])
                        msis[(int)i] = msis[(int)j] + a[(int)i];
                }
            }

            int max = Integer.MIN_VALUE;
            for(long i = 0; i < n; i++)
            {
                if(msis[(int)i] > max)
                    max = msis[(int)i];
            }

            System.out.println(max);
        }
    }
}
/*
Given an array A of N positive integers. Find the sum of maximum sum increasing subsequence of the given array.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N(the size of array). The second line of each test case contains array elements.

Output:
For each test case print the required answer in new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ Ai ≤ 106

Example:
Input:
2
7
1 101 2 3 100 4 5
4
10 5 4 3

Output:
106
10

Explanation:
Testcase 1: All the increasing subsequences are : (1,101); (1,2,3,100); (1,2,3,4,5). Out of these (1, 2, 3, 100) has maximum sum,i.e., 106.
 */