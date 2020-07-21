package LinkedListProblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List2D {
    public static void main(String[] args)
    {
        //List2D obj = new List2D();
        List<List<String>> l = new LinkedList<List<String>>();
        Scanner sc =new Scanner(System.in);

        for(int i = 0; i < 3; i++)
            l.add(new LinkedList<String>());

        for(int  i=0; i<3; i++)
            for(int j=0; j<3; j++)
            l.get(i).add(sc.next());

        PrintList(l);
        //obj.PrintList(l);
    }

    public static void PrintList(List<List<String>> l)
    {
        for(int  i=0; i<3; i++)
            for(int j=0; j<3; j++)
                System.out.println(l.get(i).get(j));
    }
}
