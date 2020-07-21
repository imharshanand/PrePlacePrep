package Hashing;
import java.io.*;
import java.util.*;

public class FindSameOccur {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int [] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String line = br.readLine();
        String [] str = line.trim().split("\\s+");
        int[] nums = new int[n];

        Set<Integer> s = new TreeSet<>();

        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            nums[i] = Integer.parseInt(str[i]);
            if(hm.containsKey(nums[i]))
            {
                hm.get(nums[i]).set(0,hm.get(nums[i]).get(0)+1);
                hm.get(nums[i]).add(i);
                s.add(nums[i]);
            }
            else
            {
                hm.put(nums[i], new LinkedList<Integer>());
                hm.get(nums[i]).add(1);
                hm.get(nums[i]).add(i);
            }
        }
        Iterator it = s.iterator();
        while(it.hasNext())
        {
            int key = (int)it.next();
            System.out.println("Similar Element: " +key);
            List node = hm.get(key);
            System.out.print("Positions : ");
            for(int i=1; i<node.size(); i++)
            {
                System.out.print((int)node.get(i) + 1+ " ");
            }
            System.out.println("\nOccurrence : "+ node.get(0));
        }
    }
}
/*
Niranjan has a set of numbers stored in an array in which he has to find the identical numbers and its positions along with the number of occurrences. Write a program to find the same.

Input format
The first line of the input consists of a single value n.

The next n lines consists of the elements of the array.

Output format
The first line of the output consists of the duplicate element.

The second line of the output consists of its index values.

The third line of the input contains number of occurrences.

8
45 23 78 64 11 22 77 23

Similar element : 23
Positions : 2 8
Occurrence : 2

5
15 15 23 15 23

Similar element : 15
Positions : 1 2 4
Occurrence : 3
Similar element : 23
Positions : 3 5
Occurrence : 2
 */
