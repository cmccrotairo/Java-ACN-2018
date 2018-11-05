package com.exercises3;

public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int temp = number;

        while (number!=0){
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number/10;
        }

        if (reverse==temp){
            return true;
        }else
            return false;

    }
}