package prtaliubwww;

import java.security.PublicKey;
import java.util.Scanner;

public class ProblemNumberSeven {
//    Java program to accept the height of a person in centimeter and categorize the person according to their height?
    public static final double TALL=182.88;
    public static final double NORMAL=170.688;
    public static final double SHORT=152.4;
    public static final double CENTIMETER=30.48;
    private double height;
    public ProblemNumberSeven(){
        System.out.println(" // ---- Please ! Enter Height in feet ---- // ");
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void inputHeight(){
        Scanner height=new Scanner(System.in);
        System.out.print("Enter Height in Inches : ");
        setHeight(height.nextDouble());
    }
    public void heightInCentimeter(){
        height=getHeight()*ProblemNumberSeven.CENTIMETER;
    }
    public void categoryAccordingToHeight(){
        if (getHeight()<=ProblemNumberSeven.SHORT){
            System.out.println("Person is Short");
        } else if (getHeight()>ProblemNumberSeven.SHORT && getHeight()<=ProblemNumberSeven.NORMAL) {
            System.out.println("Person is Normal");
        } else if (getHeight()>ProblemNumberSeven.NORMAL | getHeight()>=ProblemNumberSeven.TALL) {
            System.out.println("Person is Tall");
        }
        else {
            System.out.println("INVALID INPUT ! ");
        }
    }


}
