package com.nikhil.LinearSearchAlgorithm;

public class LinearSearchAlgo {
     // search in the array: return the index if item found,
   //  otherwise item was not found return -1
   static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
           return -1;
           
        }
      for (int element  : arr ) {
           if (element == target) {
               return element;
           }
        }
        return Integer.MAX_VALUE;
   }
   static boolean linearSearch2(int[] arr, int target){
      if (arr.length == 0) {
         return false;
         
      }
      for (int element  : arr ) {
         if (element == target) {
            return true;
         }
      }
      return false;
   }
   static int linearSearch1(int[] arr, int target){
        if (arr.length == 0) {
           return -1;
           
        }
      for (int index = 0; index < arr.length; index++) {
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
        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearch1(arr, target));
        System.out.println(linearSearch2(arr, target));
   }
}

