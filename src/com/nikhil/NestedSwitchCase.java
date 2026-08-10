package com.nikhil;
import java.util.Scanner;
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch (empId) {
            case 1: 
                System.out.println("Nikhil Malviya");    
                break;
                
                case 2: 
                    System.out.println("Arpit Prajapati");    
                    break;
                case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department write here");
                } 
                
            default:
                System.out.println("Enter correct ID");
                break;
        }
    }
}
