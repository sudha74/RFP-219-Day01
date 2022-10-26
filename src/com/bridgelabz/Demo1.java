package com.bridgelabz;

import java.util.Scanner;

public class Demo1 {
    static void valueOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        System.out.println("Enter a three digit number: ");
        number = scanner.nextInt();
        if (number <= 999 && number > 99) {
            hundreds = number / 100;
            System.out.println("Hundreds place digit is : " + hundreds);

            tens = (number - (hundreds * 100)) / 10;
            System.out.println("\nTens place digit: " + tens);

            ones = (number - (tens * 10) - (hundreds * 100));
            System.out.println("\nOnes place digit: " + ones);
        } else {
            if (number > 999)
                System.out.println("\n Number more than three digits .");
            if (number < 100)
                System.out.println(" Number is less than three digits .");
        }
    }

    public static void main(String[] args) {
        valueOfDigits();
    }
}
