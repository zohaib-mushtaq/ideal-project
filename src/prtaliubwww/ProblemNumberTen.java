package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberTen {
//    Write a java program a shop will give discount of 10% if the cost of purchased quantity is more than 1000
    public static final int ONE_UNIT_COST=100;
    public static final double DISCOUNT=0.1;
    public static final int DISCOUNT_LIMIT=1000;
    private int quantity;
    public ProblemNumberTen(){

    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void inputQuantity(){
        Scanner quantity=new Scanner(System.in);
        System.out.println("Enter Purchasing Quantity : ");
        setQuantity(quantity.nextInt());
    }
    public void totalCost(){
        double totalCost;
        if (getQuantity()>=ProblemNumberTen.DISCOUNT_LIMIT){
            System.out.println("Congrats ! You Got 10% Discount.");
            totalCost=(getQuantity()*ProblemNumberTen.ONE_UNIT_COST) - ( getQuantity()*ProblemNumberTen.DISCOUNT);
            System.out.println("Your Total Cost is : "+" "+totalCost);
        }
        else {
            totalCost=(getQuantity()*ProblemNumberTen.ONE_UNIT_COST);
            System.out.println("Your Total Cost is : "+" "+totalCost);
        }

    }
}
