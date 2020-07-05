package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Fibonacci
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getFibonacciNumberBottomUpWithCache(n));
        System.out.println(getFibonacciNumberTopDown(n));
    }

    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public static HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();

    public static int getFibonacciNumberBottomUpWithCache(int n)
    {
        hm.put(0, 0);
        hm.put(1, 1);
        for(int i = 2; i <= n; i++) {
            hm.put(i, hm.get(i - 1) + hm.get(i - 2));
        }
        return hm.get(n);
    }

    public static int getFibonacciNumberTopDown(int n)
    {
        if(hm2.containsKey(n)) return hm2.get(n);
        if(n == 0) return 0;
        if(n == 1) return 1;
        int nthValue = getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
        hm2.put(n, nthValue);
        return nthValue;
    }
}
