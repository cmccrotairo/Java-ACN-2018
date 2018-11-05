package com.exercises;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double par1, double par2){
        int par3=(int)(par1*1000);
        int par4=(int)(par2*1000);
        return (par3==par4);
    }
}