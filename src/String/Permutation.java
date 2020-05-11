package String;

import java.util.Scanner;
import java.util.Arrays;

/*
T: Permutations of a given string
P: Given a string S. The task is to print all permutations of a given string.
L: https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0
 */
public class Permutation
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- >0)
        {
            String str1=sc.next();
            char[] ch=str1.toCharArray();
            Arrays.sort(ch);
            String str= String.valueOf(ch);
            permutation("",str);
            System.out.println();
        }
    }

    public static void permutation(String prefix, String str)
    {
        int n=str.length();
        if(n==0)
        {
            System.out.print(prefix+" ");
        }
        else
        for(int i=0;i<n;i++)
        {
            permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
        }
    }
}

/*
Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA
 */