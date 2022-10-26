package com.bl;

public class RotateLeft {
    void leftRotateElementsOfArray(){
        int[]numbers={2,4,6,8,10};
        int n=2;
        System.out.println("Given Array is : ");
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] + " ");
        }
        //Left rotate the array by n times
        for (int i=0;i<n;i++){
            int j,firstElement;         //Storing first element of array to move last
            firstElement=numbers[0];
            for (j=0;j<numbers.length-1;j++){
                numbers[j]=numbers[j+1];
            }
            //Adding the firstElement at the end of array
            numbers[j]=firstElement;
        }
        System.out.println();

        //Printing the Array
        System.out.println("Array after  "+" leftRotations:  ");
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        RotateLeft rotateLeft=new RotateLeft();
        rotateLeft.leftRotateElementsOfArray();
    }
}
