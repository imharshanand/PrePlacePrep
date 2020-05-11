package Arrays;

import java.util.Scanner;

/*
T: Rearrange Array Alternately
P: Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
i.e first element should be max value, second should be min value, third should be second max,
fourth should be second min and so on...
L: https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
 */
public class RearrangeArrayAlternately
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int [] num = new int[n];
            for(int i=0; i<n; i++)
            {
                num[i]=sc.nextInt();
            }
            int i=0,j=n-1;
            while(j>i)
            {
                System.out.print(num[j]+ " ");
                System.out.print(num[i]+ " ");
                i++;
                j--;
            }
            if(i==j)
            {
                System.out.print(num[i]+"");
            }
            System.out.println();
        }
    }
}
/*
Input:
First line of input conatins number of test cases T. First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.

Constraints:
1 <=T<= 100
1 <=N<= 107
1 <=arr[i]<= 107

Example:
Input:
2
6
1 2 3 4 5 6
11
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60
 */
