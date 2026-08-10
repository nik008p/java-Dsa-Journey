package com.nikhil;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();
        // switch (fruit) {
        //     case "Mango" -> System.out.println("king of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("orange coloured");
        //     case "Grapes" -> System.out.println("small green and sweet balls ");
        //     default -> System.out.println("Please enter a valid fruit");
        // }

        int day = sc.nextInt();
       switch (day) {
       
        case 1 ->  System.out.println("Monday");
        case 2 ->  System.out.println("Tuesday");
        case 3 ->  System.out.println("wednesday");
        case 4 ->  System.out.println("Thursday");
        case 5 ->  System.out.println("Friday");
        case 6 ->  System.out.println("Saturday");
        case 7 ->  System.out.println("Sunday");
            
       }
    }

}

