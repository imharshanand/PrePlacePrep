//UniquePaths
/*
class Solution
{
    public int uniquePaths(int m, int n)
    {
        int dp [][] = new int[m+1][n+1];
        for(int [] rows: dp)
            Arrays.fill(rows, -1);
        
        return totalUniquePaths(m-1, n-1, dp);
    }
    public int totalUniquePaths(int m, int n, int dp[][])
    {
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        else
            return dp[m][n] = totalUniquePaths(m-1, n, dp) +  totalUniquePaths(m, n-1, dp);
    }
}
*/
// https://leetcode.com/problems/unique-paths/
// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid

/*
Example
Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
*/
