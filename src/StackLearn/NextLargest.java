package StackLearn;
import java.util.*;

public class NextLargest{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        List<Integer> res = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();

        for(int i=arr.length-1; i>=0; i--)//Nearest Greater to Right
        //for(int i=0; i<arr.length; i++) //Nearest Greater to Left
        {
            if(stk.size()==0)
                res.add(-1);

            else if(stk.size()>0 && stk.peek()>arr[i])
                res.add(stk.peek());

            else if(stk.size()>0 && stk.peek()<=arr[i])
            {
                while(stk.size() >0 && stk.peek() <= arr[i])
                    stk.pop();

                if(stk.size() == 0)
                    res.add(-1);

                else
                    res.add(stk.peek());
            }

            stk.push(arr[i]);
            System.out.println(stk.toString());
        }

        System.out.println(Arrays.toString(arr));
        Collections.reverse(res); //Nearest Greater to Right
        System.out.println(res.toString());
    }
}