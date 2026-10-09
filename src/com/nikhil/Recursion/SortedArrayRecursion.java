package com.nikhil.Recursion;

public class SortedArrayRecursion {
    public static void main(String[] args) {
           int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        
        if (isSorted(arr))
            System.out.print("true");
        else
            System.out.print("false");
    }
    static  boolean isSortedHelper(int[] arr, int n){
        if (n == 1 || n == 0) {
            return true;
        }
        return arr[n-1] >= arr[n-2] && isSortedHelper(arr, n-1);
    }
    static boolean isSorted(int[] arr){
        return isSortedHelper(arr, arr.length);
    }
}
