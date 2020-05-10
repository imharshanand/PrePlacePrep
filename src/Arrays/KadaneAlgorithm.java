package Arrays;

import java.util.Scanner;

/*
L: https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
P: Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 */
public class KadaneAlgorithm
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            System.out.println(compute(a,n));
        }
    }
    public static int compute(int[]a,int n){
        boolean isNeg=true;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                if(min<a[i]){
                    min=a[i];
                }
            }else{
                isNeg=false;
                break;
            }
        }
        if(isNeg){
            return min;
        }
        int curr=0;
        min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr+=a[i];
            if(curr<0){
                curr=0;
            }
            if(min<curr){
                min=curr;
            }
        }
        return min;
    }
}
/*
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-1
 */