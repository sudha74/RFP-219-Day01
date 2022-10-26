package com.bridgelabz;

import java.util.Scanner;

public class Solution {
    static  void numberToWord(char[]num) {
        int len=num.length;
        if (len==0){
            System.out.println("Empty String");
        }
        if (len>4){
            System.out.println("Length more than four is not supported");
        }
        String[]single_digits=new String[]{"one,two,three,four,five,six,seven,eight,nine"};
        System.out.println(String.valueOf(num) + ": ");
        int x=0;
        while (x<num.length){
            if (len>=3){
                if (num[x] - '0' !=0)
                    System.out.println(single_digits[num[x] - '0'] + "");
            }
        }
    }


    public static void main(String[] args) {
      numberToWord("1121".toCharArray());
    }
}
