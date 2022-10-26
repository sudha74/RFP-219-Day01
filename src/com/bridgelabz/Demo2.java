package com.bridgelabz;

import java.util.Scanner;

public class Demo2 {
    void displayUnit() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Unit");
        } else if (x == 10) {
            System.out.println("Ten");
        } else if (x == 100) {
            System.out.println("Hundred");
        } else if (x == 1000) {
            System.out.println("Thousand");
        } else if (x == 10000) {
            System.out.println("Ten Thousand");
        } else if (x == 100000) {
            System.out.println("One Lakh");
        } else {
            System.out.println("Entered number is Invalid");
        }
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.displayUnit();
    }
}
