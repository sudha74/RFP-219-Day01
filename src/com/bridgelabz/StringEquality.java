package com.bridgelabz;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the first string");
        str1 = scanner.next();
        System.out.println("Enter the second string");
        str2 = scanner.next();
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Boths strings are not equal ");
        }
    }
}
