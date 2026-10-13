package org.example.acwing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class A79 {

    public static int[] maxInWindows(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            if(!q.isEmpty() && i-q.getFirst()>=k) {
                q.removeFirst();
            }
            while (!q.isEmpty() && nums[i]>nums[q.getLast()]) {
                q.removeLast();
            }
            q.add(i);
            if(i-k+1>=0 && !q.isEmpty()) {
                res.add(nums[q.getFirst()]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();


    }

    public static void main(String[] args) {
        int[] input = new int[] {2, 3, 4, 2, 6, 2, 5, 1};
        int[] ints = maxInWindows(input, 3);
        System.out.println(ints);
    }
}
