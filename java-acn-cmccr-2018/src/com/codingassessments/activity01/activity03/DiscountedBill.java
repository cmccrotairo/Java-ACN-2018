package com.codingassessments.activity01.activity03;

public class DiscountedBill extends GroceryBill {
    public DiscountedBill(ShoppingClerk clerk) {
        super(clerk);

    }

    @Override
    public double getTotalbill() {
        double sum=0;
        for (int i=0; i<=item.length; i++){
            if(!(item[i]==null)) {
                if(item[i].isDiscounted())
                    sum += (item[i].getPrice())-(item[i].getPrice()*(item[i].getDiscountPercentage()/100));
                else
                    sum+=item[i].getPrice();
            }
            else
                break;
        }
        return sum;
    }
}
