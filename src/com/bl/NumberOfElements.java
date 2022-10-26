package com.bl;

public class NumberOfElements {
    static int printNumberOfElementsPresentInArray() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Number of elements present in the array are : " + ar.length);
        return ar.length;
    }

    public static void main(String[] args) {
        printNumberOfElementsPresentInArray();
    }
}
