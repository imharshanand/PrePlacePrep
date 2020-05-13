package String;

import java.util.*;

public class IfRotated
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        //One line solution but not working for
        //  geeksforgeeks
        //  geeksgeeksfor
        //System.out.println ( (s1+s1).contains(s2) && s1.length()==s2.length());

        System.out.println(rotateString(s1,s2));

    }

    public static boolean rotateString(String A, String B) {
        int count = 0;
        int count1 = 0;
        boolean flag = false;
        Queue<Character> que = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();
        if(A.length() == 0 && B.length() == 0){
            return true;
        }
        for(int i=0;i<A.length();i++){
            que.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++){
            list.add(B.charAt(i));
        }
        while(count1 < que.size()){
            char c = que.remove();
            que.add(c);
            count1++;
            List l = new ArrayList<>(que);
            if(l.equals(list)){
                count++;
                break;
            }
        }
        if(count > 0)
            flag = true;
        else
            flag = false;
        return flag;
    }
}


/*
Given two strings a and b. The task is to find if a string 'a' can be obtained by rotating another string 'b' by 2 places.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. In the next two line are two string a and b.

Output:
For each test case in a new line print 1 if the string 'a' can be obtained by rotating string 'b' by two places else print 0.

Constraints:
1 <= T <= 50
1 <= length of a, b < 100

Example:
Input:
2
amazon
azonam
geeksforgeeks
geeksgeeksfor

Output:
1
0
 */
