package Arrays;
public class ThreeSum{
    public static void main(String[] args) {
        System.out.println("");
    }
}
/*
import java.util.*;
import javafx.util.Pair;

public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        Set<Pair> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++)
        {
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while(j < k){
                if(nums[j] + nums[k] == target){
                    if(!set.contains(new Pair(nums[i], nums[k])))
                    {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(new Pair(nums[i], nums[k]));
                    }
                    j++;
                    k--;
                }
                else if(nums[j] + nums[k] > target) k--;
                else j++;
            }
        }
        return res;
    }
}

//L:    https://leetcode.com/problems/3sum/
//Q:    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
        Find all unique triplets in the array which gives the sum of zero.
*/