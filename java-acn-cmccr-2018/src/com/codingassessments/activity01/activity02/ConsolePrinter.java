package com.codingassessments.activity01.activity02;

public class ConsolePrinter extends BoxPrinter {
    public static void printX(int value){
        for (int x=0; x<value; x++) {

            for (int j = 0; j <value; j++) {

                if (x==j || x+j==(value-1)){
                    System.out.print("*");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}