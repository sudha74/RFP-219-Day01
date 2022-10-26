package com.bridgelabz;

public class VowelConstant {
    void checkVowelOrConstant() {
        char ch = 's';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

    public static void main(String[] args) {
        VowelConstant vowelConstant = new VowelConstant();
        vowelConstant.checkVowelOrConstant();
    }
}
