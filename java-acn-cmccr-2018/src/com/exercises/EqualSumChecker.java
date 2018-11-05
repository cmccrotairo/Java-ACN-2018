package com.exercises;

public class EqualSumChecker {
    public static boolean hasEqualSum (int num1, int num2, int num3){
        int sum;
        sum = num1 + num2;
        if (sum==num3){
            return true;
        }return false;
    }

}