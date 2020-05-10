package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
T: Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
L: https://practice.geeksforgeeks.org/problems/count-the-triplets/0
 */
public class CountTriplet
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        for(int p = 0; p < TestCase; p++){
            int size = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();}
            countTriplets(a,size);


        }}
    static void countTriplets(int a[],int size){
        Map< Integer,Integer> map =
                new HashMap< Integer,Integer>();
        for(int m = 0;m < size ; m++){
            map.put(a[m],m);
        }
        int count = 0;
        for(int i = 0; i < size-1; i++){
            for(int j = i+1; j < size; j++){
                if(map.containsKey(a[i]+a[j]))
                    count++;

            }
        }
        if(count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
/*
Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1
 */