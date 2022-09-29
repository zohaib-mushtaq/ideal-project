package prtaliubwww;

import java.util.Scanner;
import java.lang.Math.*;

public class ProblemNumberFourteen {
//    Write a java program to print absolute value of a number entered by user.

    private int number;
    public ProblemNumberFourteen(){
        System.out.println("//---- AbSOLUTE VALUE ----//");
    }
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void inputNumber(){
        Scanner number=new Scanner(System.in);
        System.out.print("Enter an Integer Value : ");
        setNumber(number.nextInt());
    }
    public void absoluteValue(){
        System.out.println("Absolute Value Of "+getNumber()+" "+"is"+" "+Math.abs(getNumber()));
    }
}

