package com.codingassessments.activity01.activity04sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Idol> lodi = new ArrayList<Idol>();

        lodi.add(new Idol("buboy",1));
        lodi.add(new Idol("kagawad",3));
        lodi.add(new Idol("dale",30));
        lodi.add(new Idol("onats",10));
        lodi.add(new Idol("kiko",68));

        System.out.println("Before Sorting");
        lodi.forEach(l ->{
            System.out.println(l);
        });

        Collections.sort(lodi);
        System.out.println("Sorted by Name");
        lodi.forEach(l ->{
            System.out.println(l);
        });
        Collections.sort(lodi, new Comparator<Idol>() {
            @Override
            public int compare(Idol arg0, Idol arg1){
                return arg0.getPlaymate() - arg1.getPlaymate();
            }
        });

        PlaymateComparator pc = new PlaymateComparator();
        Collections.sort(lodi, new PlaymateComparator());
        System.out.println("Sorted by Playmates");
        lodi.forEach(l ->{
            System.out.println(l);
        });
    }
}
