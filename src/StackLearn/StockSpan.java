package StackLearn;

import javafx.util.Pair;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        List<Integer> res = new LinkedList<>();
        Stack<Pair<Integer, Integer>> stk = new Stack<>();

        for(int i=0; i<arr.length; i++)
        {
            if(stk.size()==0)
                res.add(-1);

            else if(stk.size()>0 && stk.peek().getKey()>arr[i])
                res.add(stk.peek().getValue());

            else if(stk.size()>0 && stk.peek().getKey()<=arr[i])
            {
                while(stk.size() >0 && stk.peek().getKey() <= arr[i])
                    stk.pop();

                if(stk.size() == 0)
                    res.add(-1);

                else
                    res.add(stk.peek().getValue());
            }

            stk.push(new Pair<>(arr[i], i));
        }
        System.out.println("Res: "+res.toString());
        for(int i=0; i<arr.length; i++)
        {
            res.set(i, i - res.get(i));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Res: (After subtracting) "+res.toString());
    }
}
