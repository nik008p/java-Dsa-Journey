package com.nikhil.MathsDSAQues;

public class ques01 {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n){
        return(n & 1) == 1;
    }
}
