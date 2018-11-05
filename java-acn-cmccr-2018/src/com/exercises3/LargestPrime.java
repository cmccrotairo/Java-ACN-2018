package com.exercises3;

public class LargestPrime {
    //gets the numbers factors and finds for the largest prime available
    public static int getLargestPrime(int number){
        if(number<2){
            return -1;
        }
        int a = number;

        for (int i = 2; i<=number; i++){
            if(a%i==0){
                while(a%i==0){
                    a=a/i;
                }
            }
            if(a==1){
                return i;
            }
        }
        return -1;
    }
}