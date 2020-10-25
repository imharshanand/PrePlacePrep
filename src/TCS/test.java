package TCS;

import java.util.*;

public class test {
    public static void main(String[] args) {
        LinkedList<String> arr[] = new LinkedList[4];

        for(int i=0; i<4; i++)
        {
            arr[i] = new LinkedList<>();
        }
        arr[0].add("01");
        arr[0].add("02");
        arr[0].add("03");

        arr[1].add("11");
        arr[1].add("12");
        arr[1].add("13");

        arr[2].add("21");
        arr[3].add("31");

        System.out.println(arr[0].get(0));
        System.out.println(arr[1].get(0));
        System.out.println(arr[2].get(0));
        System.out.println(arr[3].get(0));
        System.out.println(arr[0].get(2));

    }
}
