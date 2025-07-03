/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saloni Bansal
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int max_ind_reach = 0;
        for (int ind = 0; ind < nums.length; ind++) {
            if (ind > max_ind_reach) {
                return false;
            }
            max_ind_reach = Math.max(max_ind_reach, ind + nums[ind]);
        }
        return true;

    }

}

// This code defines a method `canJump` that checks if it's possible to reach the last index of an array where each element represents the maximum jump length from that position. It iterates through the array, updating the maximum reachable index and returning false if it encounters an index that is beyond the current maximum reachable index.
//
// Time Complexity: O(n), where n is the length of the input array, as it processes each element once.
// Space Complexity: O(1), as it uses a constant amount of extra space for variables.
//
// can also be done using dp but it will increase the complexity so no need to use dp we think in a greedy way to solve this.
