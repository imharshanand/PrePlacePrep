package String;

import java.util.Scanner;

/*
P: Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
L: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
T: Reverse words in a given string
 */
public class ReverseOnlyWords
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int z=0;z<n;z++)
        {
            String str=s.next();
            String[] strarr=str.split("\\.");
            int j=0;
            for(j=strarr.length-1;j>0;j--)
            {
                System.out.print(strarr[j]+".");
            }
            System.out.println(strarr[j]);
        }


        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            String str = sc.next();
            String [] s = str.split("\\.");

            for(int i=0; i<s.length; i++)
            {
                String word = s[i];
                StringBuilder sb = new StringBuilder(word);
                sb.reverse();
                if(i!=s.length-1)
                    System.out.print(sb+".");
                else
                    System.out.print(sb);
            }
        }
        */
    }
}
/*
Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
 */