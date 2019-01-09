package com.codingassessments.activity01.activity03;

public abstract class GroceryBill {
    protected Item[] item = new Item[200];
    private ShoppingClerk clerk;

    public GroceryBill(ShoppingClerk clerk){
        this.clerk = clerk;
    }

    public void addItem(Item item) {
        for (int i=0; i<=200; i++){
            if(this.item[i]==null) {
                this.item[i] = item;
                break;
            }
        }
    }

    public void printReceipt(){
        System.out.println("Clerk: "+clerk.getName());
        System.out.println("Item name       Item Price");
        System.out.println("============================");
        for (int i=0; i<=item.length; i++){
            if(this.item[i]==null) {
                break;
            }
            System.out.println(item[i].getName()+"       "+item[i].getPrice());
        }
        System.out.println("Total price: "+getTotalbill());
    }

    public abstract double getTotalbill();
}
