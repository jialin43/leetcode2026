package org.example.leetcode;

public class L287 {
    public int findDuplicate(int[] nums) {
        int slow = 0,fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(fast==slow) {
                return fast;
            }
        }
    }
}
