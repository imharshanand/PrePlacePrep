package TCS;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int q = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();


        int res2 = (e-r) - (p1 + p2 + p3 -2*q);
        int res1 = p1 + p3 - q + (res2/3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
