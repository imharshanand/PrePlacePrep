package LinkedListProblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int i= 3;

        while (i-- > 0)
            l.add(sc.next());

        for(i=0; i<l.size(); i++)
            System.out.println(l.get(i));
    }
}
