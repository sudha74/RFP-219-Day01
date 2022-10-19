package com.bridgelabz;

public class Sample {
    void booleanDataType() {
        boolean b = false;
        System.out.println(b);
    }

    byte getValue() {
        return 0;
    }

   short getLength(String name){
        return 0;
   }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.booleanDataType();
        byte value = sample.getValue();
        System.out.println("byte value is :" + value);
        System.out.println("Length of name is :"+sample.getLength("sudha"));
    }
}
