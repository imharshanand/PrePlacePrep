package DP;

import java.util.Arrays;

public class KnapsackProblem {
    // function that returns maximum of two integers
    static int [][] dp;

    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    
    // Returns the maximum value that can be put in a knapsack of capacity W
    static int KSFun(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        if(dp[n][W] != -1)
            return dp[n][W];

        // If weight of the nth item is more than Knapsack capacity W,
        // then this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return dp[n][W] = KSFun(W, wt, val, n - 1);

        // Return the maximum of two cases: (1) nth item included (2) not included
        else
            return dp[n][W] = max(val[n - 1] + KSFun(W - wt[n - 1],wt, val, n - 1), KSFun(W, wt, val, n - 1));
    }

    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        dp = new int[n+1][W+1];
        for(int [] rows : dp)
            Arrays.fill(rows, -1);
        System.out.println(KSFun(W, wt, val, n));
    }
}