/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saloni Bansal
 */
public class JumpGame_2 {

    public int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return calc(nums, dp, 0);

    }

    public int calc(int[] nums, Integer[] dp, int ind) {
        if (ind >= nums.length - 1) {
            return 0;
        }
        if (dp[ind] != null) {
            return dp[ind];
        }
        int ans = Integer.MAX_VALUE;
        int jump = 0;
        int steps = nums[ind];
        for (int i = 1; i <= steps; i++) {
            jump = calc(nums, dp, ind + i);
            if (jump != Integer.MAX_VALUE) {
                ans = Math.min(ans, jump + 1);
            }

        }
        return dp[ind] = ans;

    } // this is the dp approach to solve the problem of Jump Game II, where we calculate the minimum number of jumps required to reach the last index of the array. The method `jump` initializes a memoization array and calls the recursive helper method `calc`, which uses dynamic programming to find the solution efficiently by storing intermediate results in the `dp` array.
    // / Time Complexity: O(n^2) in the worst case, where n is the length of the input array, due to the nested loop structure.

    public int jump_optimised(int[] nums) {
        int steps = 0, s = 0, e = 0;
        while (e < nums.length - 1) {
            int max = 0;
            for (int i = s; i <= e; i++) {
                max = Math.max(max, i + nums[i]);
            }
            s = e + 1;
            e = max;
            steps++;
        }
        return steps;
    }
    // this is the optimised approach to solve the problem of Jump Game II, where we calculate the minimum number of jumps required to reach the last index of the array. The method `jump_optimised` uses a greedy approach to find the solution efficiently by iterating through the array and updating the start and end indices for each jump.
    // // Time Complexity: O(n), where n is the length of the input array, as it processes each element once
}
