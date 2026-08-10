package com.nikhil.BinarySearchAlgorithm;

public class InfiniteArray {
    static int ans(int[] arr,int target){
int start = 0;
int end = 1;
while (target >arr[end]) {
int newStart = end + 1;
    end = end +(end-start +1)* 2;
    start = newStart;
}
return binarySearch(arr, target);
    }
        static int binarySearch(int[] arr, int target){
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
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                    100, 130, 140, 160, 170,};
                    int target = 10;
                    System.out.println(ans(arr, target));
    }
        }
