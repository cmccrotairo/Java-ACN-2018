package com.charionnerotairo;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int i) {
        if (i==0) {
            return 1;
        }else{
            int sum = 1;
            for(int x=1; x<=i ;x++){
                sum*=x;
            }
            return sum;
        }
    }


}

