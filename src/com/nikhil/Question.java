package com.nikhil;
import java.util.Scanner;
public class Question {
    static boolean isAmstrong(int n ){
        int org = n;
        int sum = 0;
    
        while (n > 0) {
            int rem = n%10;
            n = n/10;
            sum = sum+rem*rem*rem;

            
        }
      return sum == org;
}
    static boolean isPrime(int n){
        if (2*2 <= n && n% 2 ==0 && n<= 1) {
            return false;
        }
         return 2*2 > n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // // boolean ans = isPrime(n);
        // // System.out.println(ans);
        // boolean ans = isAmstrong(n);
        // System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }


        
    }
}
