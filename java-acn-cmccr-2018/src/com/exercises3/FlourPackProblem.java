package com.exercises3;

public class FlourPackProblem {
    //see solution from course
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0 || 5 * bigCount + smallCount < goal){
            return false;
        }

        int counter = 0;
        int sum = 0;

        for (int i=0; i<bigCount; i++){
            counter +=5;
        }

        return goal % 5 <= smallCount ? true : false;
    }
}
