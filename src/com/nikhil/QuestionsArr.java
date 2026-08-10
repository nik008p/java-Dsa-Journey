package com.nikhil;

import java.util.Arrays;

public class QuestionsArr {
    static void swap(int[] arr, int index1, int index2 ){
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
        //  System.out.println(Arrays.toString(arr));
    }
    // public static void main(String[] args) {
    //     int [] arr = {1, 2, 3, 5};
    //     swap(arr, 1,3);

    // }
    static int max(int[] arr){
        int maxval = arr[0];
       for (int i = 0; i < arr.length; i++) {
          if (arr[i]>maxval) {
            maxval = arr[i];
            
          }
       }
       return maxval;
    }
    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[0];
       for (int i = start; i < end; i++) {
          if (arr[i]>maxval) {
            maxval = arr[i];
            
          }
       }
       return maxval;
    }
    static void ReverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
            
        }

    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 45, 56, 67, 54};
        // System.out.println(max(arr));
        // System.out.println(maxRange(arr, 1, 4));
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
