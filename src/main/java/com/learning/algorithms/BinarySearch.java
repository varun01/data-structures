package com.learning.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {-9, -8, -7, -6, -5, -4, 0, 1, 2, 3, 4, 5, 7, 8, 90};
        int target = 8;
        int result = binaySearch(arr, target);
        System.out.println(result);
    }

    public static int binaySearch(int arr[], int findElement) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == findElement) {
                return mid;
            } else if (findElement < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
