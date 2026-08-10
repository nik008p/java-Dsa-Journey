package com.nikhil.Recursion;

import java.util.Arrays;

import com.nikhil.MathsDSAQues.que05;

/**
 * RecursionQuickSort
 */
public class RecursionQuickSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            } 
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(nums, low, e);
        QuickSort(nums, s, high);

    }

}