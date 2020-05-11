package Arrays;

import java.util.Scanner;

/*
T: Number of pairs
P: Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of)
    where x is an element from X and y is an element from Y.
L: https://practice.geeksforgeeks.org/problems/number-of-pairs/0/
 */
public class NoOfPair
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n1 = sc.nextInt();
            int arr1 [] = new int[n1];
            int n2 = sc.nextInt();
            int arr2 [] = new int[n2];

            for(int i=0; i<n1; i++)
            {
                arr1[i]=sc.nextInt();
            }
            for(int i=0; i<n2; i++)
            {
                arr2[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    if(Math.pow(arr1[i],arr2[j])>Math.pow(arr2[j],arr1[i]))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
/*
Input:
    The first line of input contains an integer T, denoting the number of test cases.
    Then T test cases follow. Each test consists of three lines.
    The first line of each test case consists of two space separated M and N denoting size of arrays X and Y respectively.
    The second line of each test case contains M space separated integers denoting the elements of array X.
    The third line of each test case contains N space separated integers denoting elements of array Y.

Output:
Corresponding to each test case, print in a new line, the number of pairs such that xy > yx.

Constraints:
1 ≤ T ≤ 100
1 ≤ M, N ≤ 105
1 ≤ X[i], Y[i] ≤ 103

Example:
Input
1
3 2
2 1 6
1 5

Output
3
 */
