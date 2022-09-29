package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberTwo {
//    Java program to check whether a given number is even or odd?

    private int number;
    public ProblemNumberTwo(){

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
        if (getNumber()%2==0){
            System.out.println("Number is Even");
        }
        else if (getNumber()%2==1) {
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Input is Invalid ! ");
        }
    }
}
