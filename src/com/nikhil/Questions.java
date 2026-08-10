package com.nikhil;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //  Q1. 
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c>max) {
            max = c ;
        }
        System.out.println(max);

    }
}
