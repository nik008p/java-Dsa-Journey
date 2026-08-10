package com.nikhil.BinarySearchAlgorithm;

public class peakindexmountainarray {
    int search(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstry != -1) {
            return firstry;
            
        }
        return  OrderAgnosticBS( arr, target, peak+1, arr.length -1);

    }

     
        public int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else{
                start = mid+1;
            }
            
        }
        return start;
    }
    static int OrderAgnosticBS(int[] arr, int target, int start, int end){
         boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // find the middle element
            //  int mid = (start+end)/ 2; //might be possible that stat+end wwe are doing it might exceed the no.of range.
            int mid = start + (end -start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                
                if (target < arr[mid]) {
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }else{
                 if (target > arr[mid]) {
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
