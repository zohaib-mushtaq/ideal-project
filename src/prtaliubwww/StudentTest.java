package prtaliubwww;

import java.util.Scanner;

public class StudentTest {
    public static final int PASSING_MARKS_LIMIT=60;
    private String name;
    private int marks;
    public StudentTest(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return this.marks;
    }
    public void studentInput(){
        Scanner student=new Scanner(System.in);
        System.out.print("Enter Name of Student : ");
        setName(student.nextLine());
        System.out.print("Enter Marks of Student : ");
        setMarks(student.nextInt());
    }
    public void studentResult(){
        if(getMarks()>=StudentTest.PASSING_MARKS_LIMIT){
            System.out.println(getName()+" : "+"Congratulations for Passing");
        }
        else {
            System.out.println(getName()+" : "+"Failed");
        }
    }

}
