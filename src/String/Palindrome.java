package String;
// https://leetcode.com/problems/valid-palindrome/
import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        int n = s.length(), i = 0, j = n - 1;
        char[] chars = s.toCharArray();

        while (i < j)
        {
            // skip any non-alphanumeric character
            if (i < n && !Character.isLetterOrDigit(chars[i]))
            {
                i++;
            }
            else if (j >= 0 && !Character.isLetterOrDigit(chars[j]))
            {
                j--;
            }
            else if (i < j && chars[i++] != chars[j--])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */