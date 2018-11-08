package com.codingassessments.activity01.activity04sample;

import java.util.Comparator;

public class PlaymateComparator implements Comparator<Idol> {
    @Override
    public int compare(Idol arg0, Idol arg1){
        return arg0.getPlaymate() - arg1.getPlaymate();
    }

}
