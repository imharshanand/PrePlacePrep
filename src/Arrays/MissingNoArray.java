package Arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
T: Missing number in array
L: https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
P:  Given an array C of size N-1 and given that there are numbers from 1 to N
    with one element missing, the missing number is to be found.
 */
public class MissingNoArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            String str = sc.nextLine();
            String[] ch = str.split(" ");
            int sum = 0;
            int naturalSum = (n * (n + 1)) / 2;
            for (int i = 0; i < ch.length; i++)
            {
                sum += Integer.parseInt(ch[i]);
            }
            System.out.println(naturalSum - sum);
        }
    }
}
/*
Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9
 */
