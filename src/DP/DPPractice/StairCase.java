package DP.DPPractice;

public class StairCase {
    public static void main(String[] args) {
        int s = 5 , m = 2;
        System.out.println("Number of ways = " + countWays(s+1, m));
    }

    static int countWays(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++)
        {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++)
                res[i] = res[i] + res[i - j];
        }
        return res[n - 1];
    }
}
// https://www.geeksforgeeks.org/count-ways-reach-nth-stair/