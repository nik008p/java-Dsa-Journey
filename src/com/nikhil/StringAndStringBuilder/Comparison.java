package com.nikhil.StringAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Nikhil";
        String b = "Nikhil";
        String c =a;
        System.out.println(a == c);

        String name1 = new String("Nikhil");
        String name2 = new String("Nikhil");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));

        String name3 = new String("Nikhil");
        String name4= new String("Malviya");
        System.out.println(name3.equals(name4));
    }
}
