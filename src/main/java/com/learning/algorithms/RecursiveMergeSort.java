package com.learning.algorithms;

import java.util.Arrays;

public class RecursiveMergeSort {

    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] arr, int start, int mid,int end){
        /**
         *
         */
        if(arr[mid-1] < arr[mid]){
            return;
        }

        int i = start;
        int j = end;
        int tempIndex = 0;
        /**
         * Temporary array to hold sorted elements.
         */
        int[] temp = new int[end-start];
        while( i < mid && j < end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,22,45,567,888,19};
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+"\t");

        sort(arr, 0, arr.length);
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+"\t");

    }
}
