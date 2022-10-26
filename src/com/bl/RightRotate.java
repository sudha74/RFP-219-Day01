package com.bl;

public class RightRotate {
    public static void main(String[] args) {
        int[]numbers={11,22,33,44,55,66};
        int n=2;
        System.out.println("Given Array is : ");
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] + " ");
        }
        //Right rotate the array by n times
        for (int i=0;i<n;i++) {
            int j, lastElement;
            //Storing the last element of the array to move to start
            lastElement = numbers[numbers.length - 1];
            for (j = numbers.length - 1; j > 0; j--) {
                //Shifting the element to right by 1 on each iteration of the loop
                numbers[j] = numbers[j - 1];
            }
            //Adding the last element at the begininig of the array
            numbers[0] = lastElement;
        }
        System.out.println();
            System.out.println("Array after "+n+" right rotations : ");
            for (int i=0;i<numbers.length;i++){
                System.out.println(numbers[i] + " ");
            }
        }
    }

