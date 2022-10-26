package com.bl;

public class Example1 {
    static void copyArrayToAnotherArray() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] copyArr2 = new int[arr1.length];

        //This loop for copy the content of arr1 to copyArr2
        for (int i = 0; i < arr1.length; i++) {
            copyArr2[i] = arr1[i];
        }
        System.out.println("Array before copied");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Array after copied");
        for (int i = 0; i < copyArr2.length; i++) {
            System.out.println(copyArr2[i]);
        }
    }

    public static void main(String[] args) {
        copyArrayToAnotherArray();
    }
}
