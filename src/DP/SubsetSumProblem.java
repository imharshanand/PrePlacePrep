package DP;

import java.io.*;

public class SubsetSumProblem
{
    public static boolean getSubsetSum(int[] arr, int target_sum)
    {
        boolean[][] dp = new boolean[arr.length+1][target_sum+1];
        for (int i = 0; i < arr.length+1 ; i++)
        {
            dp[i][0] = true ;
        }
        for (int i = 1; i < target_sum+1; i++)
        {
            dp[0][i] = false ;
        }
        for (int i = 1; i < arr.length+1 ; i++)
        {
            for (int j = 1; j < target_sum+1 ; j++)
            {
                if (arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][target_sum];

    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            int sum = 0 ;
            for (int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(strs[i]);
                sum += arr[i] ;
            }
            int target_sum = sum/2;
            if (sum%2==0)
            {
                if (getSubsetSum(arr, target_sum))
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }else {
                System.out.println("NO");
            }
        }
    }
}
/*
https://practice.geeksforgeeks.org/problems/subset-sum-problem/0

Given a set of numbers, check whether it can be partitioned into two subsets such that the sum of elements in both subsets is same or not.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Each test case constitutes of two lines. First line contains 'N', representing the number of elements in the set and the second line contains the elements of the set.

Output:
Print YES if the given set can be partioned into two subsets such that the sum of elements in both subsets is equal, else print NO.

Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= arr[i] <= 1000

Example:
Input:
2
4
1 5 11 5
3
1 3 5

Output:
YES
NO

Explanation:
Testcase 1: There exists two subsets such that {1, 5, 5} and {11}.
 */