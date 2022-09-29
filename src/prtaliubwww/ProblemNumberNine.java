package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberNine {
//    a java program take two int values from user and print greatest among them?
    private int firstValue;
    private int secondValue;
    public ProblemNumberNine(){
        System.out.println("// ---- Enter Two integer Numbers ---- //");
    }
    public void setFirstValue(int firstValue){
        this.firstValue=firstValue;
    }
    public int getFirstValue(){
        return firstValue;
    }
    public void setSecondValue(int secondValue){
        this.secondValue=secondValue;
    }
    public int getSecondValue(){
        return secondValue;
    }
    public void inputIntegers(){
        Scanner number=new Scanner(System.in);
        System.out.print("Enter First Integer : ");
        setFirstValue(number.nextInt());
        System.out.print("Enter Second Integer : ");
        setSecondValue(number.nextInt());
    }
    public void checkGreatestNumber(){
        if (getFirstValue()>getSecondValue()){
            System.out.println(getFirstValue()+" : "+"is Greater !");
        } else if (getSecondValue()>getFirstValue()) {
            System.out.println(getSecondValue()+" : "+"is Greater !");
        }
        else {
            System.out.println("Both are equal.");
        }
    }
}
