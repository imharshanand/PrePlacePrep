package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestCommonSubstring
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t>0)
        {
            String b[] = br.readLine().trim().split(" ");
            int n1 = Integer.parseInt(b[0]);
            int n2 = Integer.parseInt(b[1]);
            String s1 = br.readLine();
            String s2 = br.readLine();
            int mainstore[][] = new int[n1+1][n2+1];
            int max = 0;
            char first ='a';
            for(int i = 0; i <= n1; i ++)
            {
                if(i>0)
                    first = s1.charAt(i-1);
                for(int j = 0; j<=n2 ; j++)
                {

                    if(i==0 || j==0)
                    {
                        mainstore[i][j] = 0;
                        continue;
                    }
                    char second = s2.charAt(j-1);

                    if(first == second)
                    {
                        mainstore[i][j] = mainstore[i-1][j-1] + 1;
                        if(mainstore[i][j] > max)
                            max = mainstore[i][j];
                    }
                }
            }
            System.out.println(max);

            t--;
        }
    }
}
/*
Given two strings X and Y. The task is to find the length of the longest common substring.

Input:
First line of the input contains number of test cases T. Each test case consist of three lines, first of which contains 2 space separated integers N and M denoting the size of string X and Y strings respectively. The next two lines contains the string X and Y.

Output:
For each test case print the length of longest  common substring of the two strings .

Constraints:
1 <= T <= 200
1 <= N, M <= 100

Example:
Input:
2
6 6
ABCDGH
ACDGHR
3 2
ABC
AC

Output:
4
1

Example:
Test case 1: CDGH is the longest substring present in both of the strings.
 */