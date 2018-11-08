package com.codingassessments.activity01.activity04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Lollipop", "Red",5);
        Candy candy2 = new Candy("Max", "Green",2);
        Candy candy3 = new Candy("Cha", "Blue",3);
        Candy candy4 = new Candy("Niko", "Orange",4);
        Candy candy5 = new Candy("Lai", "Violet",1);

        List<Candy> candy = new ArrayList<Candy>();

        candy.add(candy1);
        candy.add(candy2);
        candy.add(candy3);
        candy.add(candy4);
        candy.add(candy5);



        System.out.println("Sorted By Name: ");
        System.out.println("Name Color Sweetness Level");
        Collections.sort(candy);
        for(Candy c : candy){
            System.out.println(c.getName() + "   " + c.getColor() + "   " + c.getSweetnessLevel());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted By Color: ");
        System.out.println("Name Color Sweetness Level");
        Collections.sort(candy, new ColorComparator());
        for(Candy c : candy){
            System.out.println(c.getName() + "   " + c.getColor() + "   " + c.getSweetnessLevel());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted By Sweetness Level");
        System.out.println("-------------------------------------------------");
        System.out.println("Name Color Sweetness Level");
        Collections.sort(candy, new SweetnessLevelComparator());
        for(Candy c : candy){
            System.out.println(c.getName() + "   " + c.getColor() + "   " + c.getSweetnessLevel());
        }
    }
}
