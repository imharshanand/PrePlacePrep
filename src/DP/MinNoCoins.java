package DP;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinNoCoins
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        int x=in.nextInt();
        int []a=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=in.nextInt();

            n=a[i];
            if(n>=2000)
                n=func(n,2000);
            if(n>=500&&n<2000)
                n=func(n,500);
            if(n>=200&&n<500)
                n=func(n,200);
            if(n>=100&&n<200)
                n=func(n,100);
            if(n>=50&&n<100)
                n=func(n,50);
            if(n>=20&&n<50)
                n=func(n,20);
            if(n>=10&&n<20)
                n=func(n,10);
            if(n>=5&&n<10)
                n=func(n,5);
            if(n>=2&&n<5)
                n=func(n,2);
            if(n>=1&&n<2)
                n=func(n,1);

            System.out.println("");
        }
    }
    static int func(int n,int d)
    {
        int i=0;
        while(i<(n/d))
        {
            System.out.print(d+" ");
            i++;
        }
        return (n%d);
    }
}
/*
Given a value N, total sum you have. You have to make change for Rs. N, and there is infinite supply of each of the denominations in Indian currency, i.e., you have infinite supply of { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000} valued coins/notes, Find the minimum number of coins and/or notes needed to make the change for Rs N.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of an Integer value N denoting the amount to get change for.

Output:
Print all the denominations needed to make the change in a separate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106

Example:
Input:
1
43

Output:
20 20 2 1

Explanation:
Test case 1: Sum of Rs 43 can be changed with minimum of 4 coins/ notes 20, 20, 2, 1.
 */