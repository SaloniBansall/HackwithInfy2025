/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;

/**
 *
 * @author Saloni Bansal
 */
public class PartitionArray {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ans += nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        PartitionArray obj = new PartitionArray();
        int[] nums = {1, 4, 3, 2};
        int result = obj.arrayPairSum(nums);
        System.out.println("The maximum sum of pairs is: " + result);
    }

}

// This code defines a method `arrayPairSum` that takes an array of integers, sorts it, and calculates the maximum sum of pairs by summing every second element in the sorted array. The main method demonstrates how to use this method with a sample input.
// Time Complexity: O(n log n) due to sorting the array.
// Space Complexity: O(1) if we ignore the input array, as we are not using any additional data structures that grow with input size.
