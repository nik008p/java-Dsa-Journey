package com.nikhil;
import java.util.Arrays;
import java.util.Scanner;

public class DsaArray {
    static void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        // Q : Store 5 roll numbers.
        Scanner sc = new Scanner(System.in);
        // int [] arr = new int[5];
        
        // arr[0] = 23;
        // arr[1] = 24;
        // arr[2] = 25;
        // arr[3] = 26;
        // arr[4] = 27;
        // System.out.println(arr[3]);
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        //     }
        // System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
        // }
       
        //  for (int num : arr) {
        //     System.out.print(num+ " ");
        //  }
        // String [] str = new String[5];
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = sc.next();
        // }
        // System.out.println(Arrays.toString(str));
        // str[3] = "nikhil";
        // System.out.println(Arrays.toString(str));
        int [] nums = {1,2, 3, 4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
         }
    }

