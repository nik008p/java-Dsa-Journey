package com.nikhil.MathsDSAQues;

public class ques14 {
    public static void main(String[] args) {
        System.out.println(gcd(4, 5));
        System.out.println(LCM(2, 7 ));
    }
    static int gcd(int a, int b){
        if (a == 0) {
            return b;
        }
       return gcd(b%a, a);
    }
    static int LCM(int a, int b){
        return a * b / gcd(a, b);
    }
}
