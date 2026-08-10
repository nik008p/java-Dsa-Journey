package com.nikhil;
import java.util.ArrayList;
import java.util.Scanner;                      
public class ArrayListex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(27);
        // list.add(34);
        // list.add(34345);
        
      //    System.out.println( list.contains(65));
      //     list.set(0, 100);
      //     //     list.remove(3);
      //     System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            
        }
        for (int i = 0; i < 5; i++) {
             System.out.print(list.get(i)+ " ");            
        }
System.out.println(list);
    }
}
