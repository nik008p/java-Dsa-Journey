package com.nikhil.Recursion;

public class RecursionLevel01ques03 {
    public static void main(String[] args) {
        int sum = digitsum(1342);
        System.out.println("The sum is :"+sum);
        int prod = product(1342);
        System.out.println("The product is :"+prod);
    }
    static int digitsum(int n){
        if (n == 0) {
            return 0;
        }
       return digitsum(n/10) + n%10;
    }
    static int product(int n){
        if (n%10 == n) {
            return n;
        }
       return product(n/10) * (n%10);
    }
}
