package com.nikhil.StringAndStringBuilder;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after few steps: "a" + "1"
        // Integer will be converte to Integer that will call toString();

        System.out.println("Nikhil" + new ArrayList<>());
        System.out.println("Nikhil" + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
        
    }
}