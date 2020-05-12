package String;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        int N = S.length();

        for (int i = 0; i < N; i++){
            if (!stack.isEmpty() && S.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}

/*
Given a string s, recursively remove adjacent duplicate characters from the string s. The output string should not have any adjacent duplicates.


Input:
The first line of input contains an integer T, denoting the no of test cases. Then T test cases follow. Each test case contains a string str.

Output:
For each test case, print a new line containing the resulting string.

Constraints:
1<=T<=100
1<=Length of string<=50

Example:
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac
 */