package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class CountNoOfHops {
    public static void input_split(int []array,BufferedReader br) throws IOException{
        int i=0;
        String[] line=br.readLine().trim().split(" ");
        while(i<array.length)
            array[i]=Integer.parseInt(line[i++]);}
    static StringTokenizer st;
    public static String next(BufferedReader br)throws IOException{
        if(st!=null && st.hasMoreTokens())
            return st.nextToken();
        while(true){
            st=new StringTokenizer(br.readLine().trim());
            if(st.hasMoreTokens())
                return st.nextToken();
        }
    }
    public static int nextInt(BufferedReader br)throws IOException{
        return Integer.parseInt(next(br));
    }
    public static int numofHops(int n){
        int []steps=new int [n+1];
        Arrays.fill(steps,0);
        steps[0]=1;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=3;j++)
                if(j<=i)
                    steps[i]+=steps[i-j];
        return steps[n];
    }
    public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=nextInt(br);
        int n;
        while(t-->0){
            n=nextInt(br);
            System.out.println(numofHops(n));
        }
    }
}
/*
https://practice.geeksforgeeks.org/problems/count-number-of-hops/0
Count number of hops

A frog jumps either 1, 2 or 3 steps to go to top. In how many ways can it reach the top.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains one line of input N denoting the total number of steps.

Output:
For each testcase, in a new line, print the number of ways to reach the top.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 50

Example:
Input:
2
1
5
Output:
1
13
 */