package com.codingassessments.activity01;

public class NumberUtility {
    public static void main(String[] args) {
        NumberUtility numu = new NumberUtility();


        System.out.println(numu.lastDigit(12,22,23));
        System.out.println(numu.lastDigit(23,42,55));
        System.out.println(numu.lastDigit(23,19,3));

        System.out.println(numu.loneSum(1,2,3));
        System.out.println(numu.loneSum(3,2,3));
        System.out.println(numu.loneSum(3,3,3));

    }

    public boolean lastDigit(int a, int b, int c){
        if (a<0||b<0||c<0){
            return false;
        }
        int z = a%10;
        int y = b%10;
        int x = c%10;

        if (z==y || y==x || x==z){
            return true;
        }

        return false;
    }

    public int loneSum(int a, int b, int c){

        int sum =0;
        if(a==c){
            if(b==c) {
                sum = 0;
            }
            if(b!=c) {
                sum = b;
            }
        }
        else{
            sum=a+b+c;
        }
        return sum;
    }
}
