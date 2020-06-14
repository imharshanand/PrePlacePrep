package String;
//1160. Find Words That Can Be Formed by Characters
//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
public class WordsFormbyChar
{
    public static void main(String[] args) {
        String [] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
    public static int countCharacters(String[] words, String chars) {
        int[] dict = new int[256];
        for (char c : chars.toCharArray())
        {
            dict[c]++;
        }
        int res = 0;
        for (String word : words)
        {
            int[] curDict = new int[256];
            boolean isValid = true;
            for (char c : word.toCharArray())
            {
                curDict[c]++;
                if (curDict[c] > dict[c])
                {
                    isValid = false;
                    break;
                }
            }
            res += isValid ? word.length() : 0;
        }
        return res;
    }
}
/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
 */
