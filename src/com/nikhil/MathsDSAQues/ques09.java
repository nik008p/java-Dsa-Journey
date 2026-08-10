package com.nikhil.MathsDSAQues;

public class ques09 {
    public static void main(String[] args) {
        int n = 40;
     for (int i = 1; i <= n - 1; i++) {
        System.out.println(i + " " + IsPrime(i));
     }
    }
    static boolean IsPrime( int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c ==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
