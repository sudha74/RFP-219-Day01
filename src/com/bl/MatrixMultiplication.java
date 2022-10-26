package com.bl;

import java.util.Scanner;

public class MatrixMultiplication {
    static void multiplyingTwoMatrices(){
        Scanner scanner=new Scanner(System.in);
        int r1,r2,c1,c2,sum;
        System.out.println("Enter the number of rows in matrix1");
        r1=scanner.nextInt();
        System.out.println("Enter the number of coloumns in matrix1");
        c1=scanner.nextInt();
        System.out.println("Enter the number of rows in matrix2");
        r2=scanner.nextInt();
        System.out.println("Enter the number of coloumns in matrix2");
        c2=scanner.nextInt();

        if (c1==r2) {
            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c2];

            System.out.println("Enter the elements of matrrix1");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++)
                    mat1[i][j] = scanner.nextInt();
            }

            System.out.println("Enter the elements of matrrix2");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++)
                    mat2[i][j] = scanner.nextInt();
            }
            System.out.println("\n\nResult of matrix is : ");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c2; j++) {
                    sum = 0;
                    for (int k = 0; k < r2; k++) {
                        sum += mat1[i][j] * mat2[k][j];
                    }
                    res[i][j] = sum;
                }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++)
                    System.out.println(res[i][j] + "");
                    System.out.println();
                }
            }else {
            System.out.println("Multiplication does not exist");
        }
    }


    public static void main(String[] args) {
        multiplyingTwoMatrices();
    }
}
