package com.nikhil.Recursion;

public class quesPractice {
    public static void main(String[] args) {
        int n = 5;
          quesPractice obj = new quesPractice();
        obj.printTillN(n);
    }
    public void printTillN(int n){
        if (n <= 0) {
            return;
        }
        printTillN(n - 1);
        System.out.println(n);
    }
}
