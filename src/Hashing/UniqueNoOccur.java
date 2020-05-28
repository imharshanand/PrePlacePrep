package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNoOccur
{
    public static boolean uniqueOccurrences(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> unique = new HashSet<>();
        for (int val : arr)
        {
            map.put(val, map.getOrDefault(val, 0) + 1);
            // getOrDefault(Object key, V defaultValue) method of Map interface,
            // implemented by HashMap class is used to get the value mapped with specified key.
            // If no value is mapped with the provided key then the default value is returned.
        }
        for (int val : map.values())
        {
            if (unique.contains(val))
            {
                return false;
            }
            else
            {
                unique.add(val);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
        int [] arr2 = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr2));
    }
}
