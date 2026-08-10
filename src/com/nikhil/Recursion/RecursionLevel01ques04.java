package com.nikhil.Recursion;

public class RecursionLevel01ques04 {
    public static void main(String[] args) {
       concept(5) ;
    }
    static void concept(int n){
      if (n == 1) {
        return ;
      }
      concept(--n);
      System.out.println(n + 1);
    }
}
