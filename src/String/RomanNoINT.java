package String;

import java.util.Scanner;

public class RomanNoINT
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        RomanNoINT obj = new RomanNoINT();
        System.out.println(obj.romanToDecimal(s));
    }

    int romanToDecimal(String str)
    {
        // Initialize result
        int res = 0;

        for (int i=0; i<str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i+1 <str.length())
            {
                int s2 = value(str.charAt(i+1));

                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }

        return res;
    }

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
/*
Given an string in roman no format (s)  your task is to convert it to integer .

Input:
The first line of each test case contains the no of test cases T. Then T test cases follow. Each test case contains a string s denoting the roman no.

Output:
For each test case in a new line print the integer representation of roman number s.

Constraints:
1<=T<=100
1<=roman no range<4000

Example:
Input
3
V
III
MCMIV
Output
5
3
1904
 */
