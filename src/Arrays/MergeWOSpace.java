package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
T: Merge Without Extra Space
L: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/
P: Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m.
    The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).
*/
public class MergeWOSpace
{
    public static int n1, n2;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            int [] arr1 = new int[n1];
            int [] arr2 = new int[n2];

            for(int i=0; i<n1; i++)
            {
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<n2; i++)
            {
                arr2[i] = sc.nextInt();
            }
            if(arr1.length<arr2.length)
                compute(arr1,arr2);
            else
                compute(arr2,arr1);
        }
    }
    public static void compute(int [] a, int [] b)
    {
        int min = Math.min(a.length,b.length);
        for(int i=0 ;i<min; i++)
        {
            if(a[i] < b[i])
            {
                System.out.print(a[i]+" ");
                System.out.print(b[i]+" ");
            }
            else
            {
                {
                    System.out.print(b[i]+" ");
                    System.out.print(a[i]+" ");
                }
            }
        }
        for(int i=a.length; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
/*
Input:
First line contains an integer T, denoting the number of test cases.
First line of each test case contains two space separated integers X and Y,
denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers,
denoting the first sorted array P. Third line of each test case contains Y space separated integers,
denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20
 */