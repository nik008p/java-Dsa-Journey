package com.nikhil.Recursion;

public class quesR {
    public static void main(String[] args) {
        int n = 12345;
      int result =  sumOfdiGits(n);
      System.out.println(result);
    }
    static int sumOfdiGits(int n){
        if (n == 0) {
            return 0;
        }
        return n%10 +  sumOfdiGits( n/10);
    }
}
