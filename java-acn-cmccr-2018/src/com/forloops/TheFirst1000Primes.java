package com.forloops;

public class TheFirst1000Primes {
    //https://primes.utm.edu/lists/small/1000.txt
    public static void main(String[] args) {
        for (int i=1; i<=1000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
