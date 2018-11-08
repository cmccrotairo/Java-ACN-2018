package com.codingassessments.activity01.activity03;

public class RegularBill extends GroceryBill {

    public RegularBill(ShoppingClerk clerk){
        super(clerk);
    }

    @Override
    public double getTotalbill() {
        double sum=0;
        for (int i=0; i<=item.length; i++){
            if(!(item[i]==null)) {
                sum += item[i].getPrice();
            }else
                break;

        }
        return sum;
    }




}
