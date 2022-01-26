package com.learning.leetcodeproblems;

/**
    Given an array nums of integers, return how many of them contain an even number of digits.

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
 */
public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int count = findNumbers(nums);
        System.out.println(count);
    }

    public static int findNumbers(int[] nums) {
        int totalNums = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(temp >=0 && temp <= 9){
                continue;
            }
            int digits = 0;
            while(temp > 0) {
                temp = temp/10;
                digits++;
            }
            if(digits % 2 ==0){
                totalNums++;
            }
        }
        return totalNums;
    }

    public static int findNumbersUsingString(int[] nums) {
        int totalNums = 0;
        for(int i = 0; i < nums.length; i++){
            String num = String.valueOf(nums[i]);
            if(num.length()%2 == 0)
                totalNums++;
        }
        return totalNums;
    }
}
