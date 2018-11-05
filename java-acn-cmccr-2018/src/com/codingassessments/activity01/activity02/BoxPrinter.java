package com.codingassessments.activity01.activity02;

public class BoxPrinter {
    public static void printBox(int num){
        for (int x=0; x<=num; x++){
            System.out.print(" ");
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}