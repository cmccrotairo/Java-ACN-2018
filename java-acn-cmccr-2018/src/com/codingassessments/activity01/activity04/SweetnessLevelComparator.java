package com.codingassessments.activity01.activity04;

import java.util.Comparator;

public class SweetnessLevelComparator implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getSweetnessLevel() - o2.getSweetnessLevel();
    }
}
