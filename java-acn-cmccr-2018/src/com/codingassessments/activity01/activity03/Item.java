package com.codingassessments.activity01.activity03;

public class Item {
    private String name;
    private double price;
    private boolean isDiscounted;
    private double discountPercentage;

    public Item(String name, double price, boolean isDiscounted, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.isDiscounted = isDiscounted;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
