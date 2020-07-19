package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinSumPartition {
    public static void input_split(int []array, BufferedReader br) throws IOException {
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
    public static int minSumPartition(int []arr, int n){
        int sum=0;
        for(int i:arr)
            sum+=i;
        boolean table[][]=new boolean [n+1][sum/2+1];
        for(int i=0;i<=n;i++)
            table[i][0]=true;
        for(int i=1;i<=sum/2;i++)
            table[0][i]=false;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=sum/2;j++){
                table[i][j]=table[i-1][j];
                if(arr[i-1]<=j)
                    table[i][j]|=table[i-1][j-arr[i-1]];
            }
        for(int i=sum/2;i>=0;i--){
            if(table[n][i])
                return sum-2*i;
        }
        return -1;
    }
    public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=nextInt(br);
        int n;
        int []arr;
        while(t-->0){
            n=nextInt(br);
            arr=new int[n];
            input_split(arr,br);
            System.out.println(minSumPartition(arr,n));
        }
    }
}
/*
Minimum sum partition
https://practice.geeksforgeeks.org/problems/minimum-sum-partition/0
Given an array, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, the first line contains an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.


Output:
In each seperate line print minimum absolute difference.


Constraints:
1<=T<=200
1<=N<=50
1<=A[i]<=200


Example:
Input:
2
4
1 6 5 11
4
36 7 46 40

Output :
1
23

Explaination :
Testcase 1:
Subset1 = {1, 5, 6} ; sum of Subset1 = 12
Subset2 = {11} ;       sum of Subset2 = 11

Testcase 2:
Subset1 = {7, 46} ;   sum = 53
Subset2 = {36, 40} ; sum = 76
 */
