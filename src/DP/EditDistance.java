package DP;

import java.util.Scanner;

public class EditDistance {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n1=s.nextInt();
            int n2=s.nextInt();
            String str1=s.next();
            String str2=s.next();

            System.out.println(util(str1,n1,str2,n2));
        }
    }

    public static int util(String str1, int n1, String str2, int n2){
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=n2;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
                }
            }
        }
        return dp[n1][n2];

    }
}
/*
Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1′ into ‘str2′.

Insert
Remove
Replace
All of the above operations are of cost=1.
Both the strings are of lowercase.

Input:
The First line of the input contains an integer T denoting the number of test cases. Then T test cases follow. Each tese case consists of two lines. The first line of each test case consists of two space separated integers P and Q denoting the length of the strings str1 and str2 respectively. The second line of each test case coantains two space separated strings str1 and str2 in order.

Output:
Corresponding to each test case, print in a new line, the minimum number of operations required.

Constraints:
1 <= T <= 50
1 <= P <= 100
1 <= Q <= 100

Example:
Input:
1
4 5
geek gesek

Output:
1

Explanation:
Test case 1: One operation is required to make 2 strings same i.e. removing 's' from str2.
 */