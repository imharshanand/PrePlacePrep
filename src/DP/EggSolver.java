package DP;

import java.util.Arrays;

public class EggSolver
{
    public static void main(String[] args)
    {
        System.out.println(new EggSolver().solveUsingDp(8, 4));
    }

    public int solveUsingDp(int n, int k)
    {
        final int results[][] = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++)
        {
            results[i][1] = i;
        }
        for (int i = 0; i < k + 1; i++)
        {
            results[1][i] = 1;
        }
        for (int i = 2; i < n + 1; i++)
        {
            for (int j = 2; j < k + 1; j++)
            {
                results[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x < i; x++)
                {
                    final int brokenEggResult = results[x - 1][j - 1];
                    final int EggSurvivedResult = results[i - x][j];
                    int temp = Math.max(brokenEggResult, EggSurvivedResult) + 1;
                    if (temp < results[i][j])
                    {
                        results[i][j] = temp;
                    }
                }
            }
        }
        for (final int[] a : results)
        {
            System.out.println(Arrays.toString(a));
        }
        return results[n][k];
    }
}
/*
[0, 0, 0, 0, 0]
[1, 1, 1, 1, 1]
[0, 2, 2, 2, 2]
[0, 3, 2, 2, 2]
[0, 4, 3, 3, 3]
[0, 5, 3, 3, 3]
[0, 6, 3, 3, 3]
[0, 7, 4, 3, 3]
[0, 8, 4, 4, 4]
4
 */

/*
887. Super Egg Drop
https://leetcode.com/problems/super-egg-drop/
Input: K = 1, N = 2
Output: 2

Time Complexity: O(n*k^2).
Where ‘n’ is the number of eggs and ‘k’ is the number of floors,
as we use a nested for loop ‘k^2’ times for each egg
 */

/*
public int superEggDrop(int K, int N)
{
    int[][] dp = new int[N + 1][K + 1];
    int m = 0;
    while (dp[m][K] < N)
    {
        ++m;
        for (int k = 1; k <= K; ++k)
            dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1;
    }
    return m;
}
 */