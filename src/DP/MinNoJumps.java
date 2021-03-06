package DP;

import java.lang.*;
import java.io.*;
public class MinNoJumps {
    public static int getMinJumps(int[] arr, int n){
        if (n==0 || arr[0]==0) return -1;
        int[] jump = new int[n];
        jump[0] = 0 ;
        for (int i = 1; i < n; i++) {
            jump[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j+ arr[j] && arr[j] != Integer.MIN_VALUE){
                    jump[i] = Math.min(jump[i], jump[j] +1 );
                    break;
                }
            }
        }
        return jump[n-1]!=Integer.MAX_VALUE?jump[n-1]:-1;
    }
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(strs[i]);
            System.out.println(getMinJumps(arr, n));
        }
    }
}
/*
https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0

Given an array of integers where each element represents the max number of steps that can be made forward from that element. The task is to find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

Input:
The first line contains an integer T, depicting total number of test cases.  Then following T lines contains a number n denoting the size of the array. Next line contains the sequence of integers a1, a2, ..., an.

Output:
For each testcase, in a new line, print the minimum number of jumps. If answer is not possible print "-1"(without quotes).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
0 <= ai <= 107

Example:
Input:
2
11
1 3 5 8 9 2 6 7 6 8 9
6
1 4 3 2 6 7
Output:
3
2

Explanation:
Test case 1: First jump from 1st element, and we jump to 2nd element with value 3. Now, from here we jump to 5h element with value 9. and from here we will jump to last.
 */