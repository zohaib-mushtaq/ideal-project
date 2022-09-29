package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberOne {
//    Java program to accept two integers and check whether they are equal or not?

    private int number_1;
    private int number_2;
    public ProblemNumberOne(){

    }
    public void inputNumbers(){
        Scanner number=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        setNumber_1(number.nextInt());
        System.out.print("Enter First Number : ");
        setNumber_2(number.nextInt());
    }
    public void checkNumbers(){
        if (number_1==number_2){
            System.out.println("Numbers are Equal");
        }
        else {
            System.out.println("Numbers are Not Equal");
        }
    }
    public void setNumber_1(int number_1){
        this.number_1=number_1;
    }
    public int getNumber_1(){
        return number_1;
    }
    public void setNumber_2(int number_2){
        this.number_2=number_2;
    }
    public int getNumber_2(){
        return number_2;
    }
}
