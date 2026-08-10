package com.nikhil.LinearSearchAlgorithm;

public class SearchInRange {
    static int linearSearch1(int[] arr, int target, int start, int end){
    if (arr.length == 0) {
       return -1;
       
    }
  for (int index = start; index <= end; index++) {
     int element = arr[index];
       if (element == target) {
           return index;
       }
    }
    return Integer.MAX_VALUE;
        
}
    public static void main(String[] args) {
         int[] arr = {23, 45, 67, 89, 12, 34};
       int target = 12;
        System.out.println(linearSearch1(arr, target, 2, 5));
  }
}
