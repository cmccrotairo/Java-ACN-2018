package com.codingassessments.activity01.activity04;

public class Candy implements Comparable<Candy> {
    private String name;
    private String color;
    private int sweetnessLevel;

    public Candy(String name, String color, int sweetnessLevel) {
        this.name = name;
        this.color = color;
        this.sweetnessLevel = sweetnessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public int compareTo(Candy o) {
        return this.name.compareTo(o.name);
    }
}
