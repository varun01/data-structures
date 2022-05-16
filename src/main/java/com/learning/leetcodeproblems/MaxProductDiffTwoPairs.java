package com.learning.leetcodeproblems;

/*
* The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.



Example 1:

Input: nums = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
* */

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductDiffTwoPairs {
    public static int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0;
        int min1 = 0, min2 = 0;
        max1 = nums[0];
        min1 = nums[0];
        max2 = -1;

        boolean isSame = false;
        max2 = nums[0];
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == max2){
                isSame = true;
            } else {
                isSame = false;
            }
        }
        if(isSame)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max1 = nums[i];
            }
            if (min1 > nums[i]) {
                min1 = nums[i];
            }
        }
        min2 = max1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max1 && max2 < nums[i] ) {
                max2 = nums[i];
            }
            if (nums[i] != min1 && min2 > nums[i] ) {
                min2 = nums[i];
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    public static void main(String[] args) {
        int[] nums = {10,10,10,10};
        Scanner s = new Scanner(System.in);
        int name = s.nextInt();
        System.out.println(maxProductDifference(nums));
    }
}
