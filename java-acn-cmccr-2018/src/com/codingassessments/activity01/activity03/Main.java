package com.codingassessments.activity01.activity03;

public class Main {
    public static void main(String[] args) {
        ShoppingClerk clerk1 = new ShoppingClerk("cha");

        Item item1 = new Item("Panteen Shampoo",25.00, false, 0.00);
        Item item2 = new Item("Creamsilk Conditioner",30.00, false, 0.00);
        Item item3 = new Item("Colgate Toothpaste",100.00, true, 10.00);
        Item item4 = new Item("Safeguard Soap",50.00, true, 20.00);
        Item item5 = new Item("Pond’s Facial Wash",75.00, false, 0.00);



        GroceryBill gb = new RegularBill(clerk1);
        GroceryBill gb2 = new DiscountedBill(clerk1);
        gb.addItem(item1);
        gb.addItem(item2);
        gb.addItem(item3);
        gb.addItem(item4);
        gb.addItem(item5);


        gb.printReceipt();
        gb2.item = gb.item;
        gb2.printReceipt();


    }

}
