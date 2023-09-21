/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start 

import java.util.HashMap;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

// map is data structure that store key-value pairs

// if statement checks if the complement of the current element is present in
// the seen map. If it is, then we have found two elements that add up to the
// target value. We return an array containing the indices of those two
// elementst