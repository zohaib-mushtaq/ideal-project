package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberSix {
//    program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0?
    private int m;
    public ProblemNumberSix(){

    }
    public void setM(int m){
        this.m=m;
    }

    public int getM() {
        return m;
    }
    public void input(){
        Scanner m=new Scanner(System.in);
        System.out.print("Enter The Value Of 'm' : ");
        setM(m.nextInt());
    }
    public void displayValue(){
        int n;
        if (getM()>0){
            n=1;
            System.out.println("Value of 'n' is : "+n);
        } else if (getM()==0) {
            n=0;
            System.out.println("Value of 'n' is : "+n);
        } else if (getM()<0) {
            n=-1;
            System.out.println("Value of 'n' is : "+n);
        }
        else {
            System.out.println("Invalid Input ! ");
        }
    }
}
