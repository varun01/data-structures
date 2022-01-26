package com.learning.leetcodeproblems;

/*
    Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                counter++;
            } else {
                max = max < counter ? counter : max;
                counter = 0;
            }
        }
        max = max < counter ? counter : max;
        return max;
    }
}
