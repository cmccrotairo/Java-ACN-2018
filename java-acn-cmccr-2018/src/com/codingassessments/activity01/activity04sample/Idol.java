package com.codingassessments.activity01.activity04sample;

public class Idol implements Comparable<Idol> {
    private String name;
    private int playmate;

    public Idol(String name, int playmate){
        super();
        this.name = name;
        this.playmate = playmate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlaymate() {
        return playmate;
    }

    public void setPlaymate(int playmate) {
        this.playmate = playmate;
    }


    @Override
    public String toString(){
        return name + "\t" + playmate;
    }

    @Override
    public int compareTo(Idol arg0){
        return name.compareTo(arg0.name);
    }
}
