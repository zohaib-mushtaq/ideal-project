package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberEight {
//    Write a java program take values of length and breadth of a rectangle from user and check if it is square or not?
    private double length;
    private double breadth;
    public ProblemNumberEight(){
        System.out.println("// ---- Enter length and Breadth ---- //");
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public double getBreadth(){
        return breadth;
    }
    public void getInput(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter length of Square : ");
        setLength(obj.nextDouble());
        System.out.print("Enter breadth of Square :");
        setBreadth(obj.nextDouble());
    }
    public void checkSquareOrNot(){
        if (getLength()==getBreadth()){
            System.out.println("It is Square. ");
        } else if (getBreadth()!=getLength()) {
            System.out.println("It is not Square.");
        }
        else {
            System.out.println("Invalid Input !");
        }
    }


    }
