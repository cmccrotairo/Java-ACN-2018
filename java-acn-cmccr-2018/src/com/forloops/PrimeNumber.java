package com.forloops;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i=1; i<=50; i++){
            if(isPrime(i)){
                System.out.println(i+ " is a prime number!");
            }
        }
    }
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
