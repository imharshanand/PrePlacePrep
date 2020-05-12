package String;

import java.util.Scanner;

public class LongPalindrome3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String res ="";
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.substring(i,i+2).equals(sb.substring(i,i+2)))
            {
                res = res+s.substring(i,i+1);
            }
        }
        System.out.println(res);
    }
}
