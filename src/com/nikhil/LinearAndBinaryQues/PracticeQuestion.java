package com.nikhil.LinearAndBinaryQues;

public class PracticeQuestion {
   
         static int CeilingNoSearch(int[] arr, int target){
           int start = 0;
        int end = arr.length -1;
        
        // find whether array is sorted in ascending or desceding.
        // boolean isAsc = arr[start] < arr[end];
      

        while (start <= end) {
            // find the middle element
            //  int mid = (start+end)/ 2; //might be possible that stat+end wwe are doing it might exceed the no.of range.
            int mid = start + (end -start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            }else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
         int[] arr = {-20, -12, -6, -2, 0, 2, 5, 9, 10, 18, 25, 47};
        //  int target = -2;
        //  int ans =binarySearch(arr, target);
        //  System.out.println(ans);
         System.out.println(CeilingNoSearch(arr, 8));
    }
}

    

