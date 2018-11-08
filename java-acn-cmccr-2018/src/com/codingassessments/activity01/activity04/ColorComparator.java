package com.codingassessments.activity01.activity04;

import java.util.Comparator;

public class ColorComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
