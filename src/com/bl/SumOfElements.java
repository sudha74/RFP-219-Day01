package com.bl;

public class SumOfElements {
    int printSumOfElementsInArray() {
        int[] ar = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        return sum;
    }

    public static void main(String[] args) {
        SumOfElements sumOfElements = new SumOfElements();
        System.out.println("sum of the elements present in the given array is : " + sumOfElements.printSumOfElementsInArray());
    }
}
