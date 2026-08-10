package com.nikhil.BinarySearchAlgorithm;

public class OrderAgnosticBS {
    static int OrderAgnosticBS(int[] arr, int target){

      int start = 0;
        int end = arr.length -1;
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
         int[] arr = {-20, -12, -6, -2, 0, 2, 5, 9, 10, 22, 18, 25, 47};
         int[] darr = {99, 88, 77, 66, 55, 44, 22, 10, 8, 0};
         int target = 22;
         System.out.println(OrderAgnosticBS(arr, target));
         int ans = OrderAgnosticBS(darr, target);
         System.out.println(ans);

    }
}
