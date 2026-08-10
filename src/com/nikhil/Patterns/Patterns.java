package com.nikhil.Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern01(4);
        System.out.println();
        pattern02(5);
        System.out.println();
        pattern03(4);
        System.out.println();
        pattern04(5);
        System.out.println();
        pattern05(5);
        System.out.println();
        pattern05type2(5);
        System.out.println();
        pattern06(5);
        System.out.println();
        pattern07(5);

    }
    static void pattern07(int n ){
        for (int row = 1; row <= n; row++) {
            
            for (int space = 0; space < n - row; space++) {
             System.out.print("  ");   
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern01(int n){
        for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= row; col++) {
            System.out.print(" * ");
           } 
           System.out.println();
        }
    }
    static void pattern02(int n){
        for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= n; col++) {
            System.out.print(" * ");
           } 
           System.out.println();
        }
    }
    static void pattern03(int n){
        for (int row = 0; row <= n; row++) {
           for (int col = 1; col <= n - row; col++) {
            System.out.print(" * ");
           } 
           System.out.println();
        }
    }
    static void pattern04(int n){
        for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= row; col++) {
            System.out.print(col+" ");
           } 
           System.out.println();
        }
    }
    static void pattern05(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    static void pattern05type2(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    static void pattern06(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
