package com.exercises3;

public class EvenDigitSum {
    //gets even digits and sums all together
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number<0){
            return -1;
        }

        while(number>0){
            int digit = number % 10;
            if(digit%2==0){
                sum += digit;
            }
            number/=10;

        }
        return sum;

    }
}