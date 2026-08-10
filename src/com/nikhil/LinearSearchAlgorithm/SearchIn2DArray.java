package com.nikhil.LinearSearchAlgorithm;

public class SearchIn2DArray {
    static int[] searching(int arr[][],int target){
        for (int r = 0; r <arr.length; r++) {
             for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }
        return new int []{-1, -1};
    }
    static int max(int[][] arr){
        int maximum = Integer.MIN_VALUE;
           for (int[] row : arr) {
            for (int element : row) {
                if (element > maximum) {
                    maximum = element;
                }
                
            }
            
        }
           return maximum; 
        
        
    }
    public static void main(String[] args) {
        int[][] arr = {
           {21, 23, 45},
           {1, 4, 19},
           {5, 89, 24},
           {58, 8, 63, 59, 80},

        };
        int target = 59; 
        int[] result = searching(arr, target);
        System.out.println("Found at: [" + result[0] + ", " + result[1] + "]");
        System.out.println(max(arr));
    }
}
