package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberThree {
//    Java program to check whether a given number is positive or negative?
    private int number;
    public ProblemNumberThree(){

    }
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void inputNumber(){
        Scanner number=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        setNumber(number.nextInt());
    }
    public void checkNumber(){
        if (getNumber()>=0){
            System.out.println("Number is positive !");
        }
        else {
            System.out.println("Number is Negative !");
        }
    }
}
