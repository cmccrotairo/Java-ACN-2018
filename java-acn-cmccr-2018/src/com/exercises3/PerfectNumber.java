package com.exercises3;

public class PerfectNumber {
    //checks to see if the sum of the factors of the given number are equal to the given number itself
    public static boolean isPerfectNumber(int number){
        int sum=0;
        if (number<1){
            return false;
        }

        for (int i = 1; i<number; i++){
            if (number%i==0){
                System.out.println(i);
                sum += i;
            }
        }

        if (sum==number){
            return true;
        }
        return false;
    }
}