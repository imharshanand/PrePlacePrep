package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int sum = 9;
        int res [] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length; i++)
        {
            if(hm.containsKey(sum - nums[i]))
            {
                res[0] = hm.get(sum - nums[i]);
                res[1] = i;
            }
            hm.put(nums[i], i);
        }
        System.out.println(Arrays.toString(res));
    }
}
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */