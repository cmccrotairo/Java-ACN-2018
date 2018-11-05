package com.exercises3;

public class SharedDigit {
    //if the number appears twice on each given number
    public static boolean hasSharedDigit(int start, int end){
        if(start<10 || start>99 || end<10 || end>99 ){
            return false;
        }

        int lastDigit = start%10;
        int firstDigit = start/10;

        int lastDigit1 = end%10;
        int firstDigit1 = end/10;

        if(lastDigit==lastDigit1 || lastDigit == firstDigit1){
            return true;
        }
        else if(firstDigit1==lastDigit || firstDigit1 == firstDigit){
            return true;
        }
        else
            return false;
    }
}