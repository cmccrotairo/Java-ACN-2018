package com.looplogic;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else {
            for(int i = 1; i<=number; i++){ // row
                for(int j = 1; j<=number; j++){ // column
                    if((i==1) || (j==1) || (i==number) || (j==number)|| (i==j) || (j == ((number - i)+1))){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}