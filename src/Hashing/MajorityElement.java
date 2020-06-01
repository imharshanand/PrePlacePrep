package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums [] = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int mkey = 0;
        int mval = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else
            {
                hm.put(nums[i], 1);
            }

            Iterator hmIterator = hm.entrySet().iterator();
            while (hmIterator.hasNext())
            {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                if( (int)mapElement.getValue() > mval )
                {
                    mkey = (int)mapElement.getKey();
                    mval = (int)mapElement.getValue();
                }
            }
        }
        System.out.println(mkey);
    }
}
/*
L: https://leetcode.com/problems/majority-element/
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input: [3,2,3]
Output: 3

Input: [2,2,1,1,1,2,2]
Output: 2
 */