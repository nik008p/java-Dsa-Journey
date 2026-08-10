package com.nikhil.LinearAndBinaryQues;

public class CeilingQuesno2 {
     static int CeilingQuesno2Searc(int[] arr, int target){
           int start = 0;
        int end = arr.length -1;
        
        // find whether array is sorted in ascending or desceding.
        boolean isAsc = arr[start] < arr[end];
      

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
        return arr[end];
    }
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 14, 16, 18};
        System.out.println(CeilingQuesno2Searc(arr, 15));
    }
}
