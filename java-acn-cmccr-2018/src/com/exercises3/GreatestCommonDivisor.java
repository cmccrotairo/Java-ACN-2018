package com.exercises3;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second){
        int greatestCommonDivisor=0;

        if ( first<10 || second<10){
            return -1;
        }
        for (int n=1; n<=first && n<=second; n++){
            if (first%n==0 && second%n==0){
                greatestCommonDivisor = n;
            }
        }
        return greatestCommonDivisor;
    }
}