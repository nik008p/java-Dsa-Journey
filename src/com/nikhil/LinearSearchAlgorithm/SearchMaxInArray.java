package com.nikhil.LinearSearchAlgorithm;

public class SearchMaxInArray {
     static int max(int[] arr){
         int max = arr[0];
for (int i = 1;i<arr.length;i++) {
       if (arr[i]> max) {
           max = arr[i];
       }
    }
    return max;
        
}
    public static void main(String[] args) {
          int[] arr = {23, 45, 67, 89, 12, 34};
          System.out.println(max(arr));
    }
}
