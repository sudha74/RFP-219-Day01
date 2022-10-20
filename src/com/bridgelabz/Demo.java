package com.bridgelabz;

import java.util.Scanner;

public class Demo {
    static int x = 10;
    static int y = 12;    //static variables

    static void addition() {     //static method
        int sum = x + y;
        System.out.println("The addition of two numbers is : " + sum);
    }

    static {    //static block
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter the name :");
        name = scanner.next();
        System.out.println("The name is : " + name);
    }

    public static void main(String[] args) {
        addition();
    }
}
