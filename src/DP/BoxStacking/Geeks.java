package DP.BoxStacking;

import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        //sc.next();
        while(t-- > 0)
        {
            int n = sc.nextInt();

            int A[]  =new int[1000];
            int B[] = new int[1000];
            int C[] = new int[1000];

            for(int i = 0; i < n; i++)
            {
                int a =sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                A[i] = a;
                B[i] = b;
                C[i] = c;
            }

            Geeks ob = new Geeks();
            System.out.println(ob.maxHeight(A,B,C,n));
        }
    }
}
// Driver Code Ends
// User function Template for Java

public class Geeks
{
    public static int maxHeight(int height[], int width[], int length[], int n)
    {
        // your code here
        int maxheight=0;
        Pair[] arr=new Pair[6*n];
        int counter=0;
        for(int i=0;i<n;i++)
        {
            int h=height[i];
            int b=width[i];
            int l=length[i];
            arr[counter++]=new Pair(h,l,b);
            arr[counter++]=new Pair(h,b,l);
            arr[counter++]=new Pair(l,b,h);
            arr[counter++]=new Pair(l,h,b);
            arr[counter++]=new Pair(b,l,h);
            arr[counter++]=new Pair(b,h,l);
        }
        Arrays.sort(arr);
        int[] dp=new int[arr.length];
        for(int i=0;i<dp.length;i++)
        {
            int ol=arr[i].l;
            int ob=arr[i].b;
            int max=Integer.MIN_VALUE;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j].l>ol&&arr[j].b>ob)
                {
                    max=Math.max(max, dp[j]);
                }
            }
            if(max==Integer.MIN_VALUE)
            {
                dp[i]=arr[i].h;
            }
            else
            {
                dp[i]=arr[i].h+max;
            }
            maxheight=Math.max(maxheight, dp[i]);
        }
        return maxheight;
    }

    public static class Pair implements Comparable<Pair>
    {
        int l;
        int h;
        int b;

        Pair(int l,int b,int h)
        {
            this.l=l;
            this.b=b;
            this.h=h;
        }

        @Override
        public int compareTo(Pair p) {
            // TODO Auto-generated method stub
            if(p.l==this.l)
                return p.b-this.b;
            return p.l-this.l;
        }
    }
}
/*
You are given a set of N types of rectangular 3-D boxes, where the ith box has height h, width w and length l. You task is to create a stack of boxes which is as tall as possible, but you can only stack a box on top of another box if the dimensions of the 2-D base of the lower box are each strictly larger than those of the 2-D base of the higher box. Of course, you can rotate a box so that any side functions as its base.It is also allowable to use multiple instances of the same type of box. You task is to complete the function maxHeight which returns the height of the highest possible stack so formed.

Input:
The first line of input contains an integer T denoting the number of test cases then T test cases follow. Each test case contains an integer N denoting the total no of boxes available. In the next line are 3*N space separated values denoting the height, width and length of the N boxes.

Output:
For each test case in a new line output will be the highest possible stack height which could be formed.

Your Task:
Complete the function maxHeight() which takes three arrays height[], width[], length[], and N as a number of boxes and returns the highest possible stack height which could be formed.

Expected Time Complexity : O(N*N)
Expected Auxiliary Space: O(N)

Constraints:
1<=T<=100
1<=N<=100
1<=l,w,h<=100

Example (To be used for expected output) :
Input:
2
4
4 6 7 1 2 3 4 5 6 10 12 32
3
1 2 3 4 5 6 3 4 1

Output
60
15

Explanation:
Test Case 1:
One way of placing the boxes is as follows in the bottom to top manner:
(Denoting the boxes in (l, w, h) manner)
(12, 32, 10) (10, 12, 32) (6, 7, 4) (5, 6, 4) (4, 5, 6) (2, 3, 1) (1, 2, 3)
Hence, the total height of this stack is 10 + 32 + 4 + 4 + 6 + 1 + 3 = 60.
No other combination of boxes produces a height greater than this.
 */