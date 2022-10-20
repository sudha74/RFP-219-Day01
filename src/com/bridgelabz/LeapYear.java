package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    static void checkLeapYearOrNot() {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter an year : ");
        year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 400 == 0))
            System.out.println("Specified year is Leap year");
        else
            System.out.println("Specified year is not Leap year");
    }

    public static void main(String[] args) {
        checkLeapYearOrNot();
    }
}
