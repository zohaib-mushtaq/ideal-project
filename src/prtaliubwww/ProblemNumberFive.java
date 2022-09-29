package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberFive {
//    Java program to find whether a given year is a leap year or not?

    private int year;
    public ProblemNumberFive(){

    }
    public void setYear(int year){
        this.year=year;
    }

    public int getYear() {
        return year;
    }
    public void inputYear(){
        Scanner year=new Scanner(System.in);
        System.out.print("Enter a Desired Year ! ");
        setYear(year.nextInt());
    }
    public void checkLeapYear(){
        if (getYear()%4==0){
            System.out.println("Input Year is 'Leap Year' ");
        } else if (getYear()%4!=0) {
            System.out.println("Year is Not a 'Leap Year'");
        }
        else {
            System.out.println("Invalid Input ! ");
        }
    }
}
