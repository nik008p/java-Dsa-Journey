package com.nikhil.LinearSearchAlgorithm;

public class EvenDigit {
    static int findnumbers(int [] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }
    //   function to check arr contains even no. or not.
    private static boolean even(int num) {
      int numberOfDigits = digits(num);
    //   if (numberOfDigits % 2 == 0) {
    //     return true;
        
    //   }else{
    //     return false;
    //   }
    return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        int count =0;
        while(num> 0){
            count++;
            num = num/10;
            
        }
        return count;
    }
    // 2nd way to fing the no. of digits in the particular index of array.
    static int ditgits2(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int)Math.log10(num)+1;
    }
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
         System.out.println((findnumbers(nums)));
         System.out.println(ditgits2(234254));
    }
}
