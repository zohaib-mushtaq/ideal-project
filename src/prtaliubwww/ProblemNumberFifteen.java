package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberFifteen {
    public static final double ALLOWANCE_ATTENDANCE_LIMIT=75;
    private double numberOfClassesHeld;
    private double numberOfClassesAttend;
    public ProblemNumberFifteen(){
        System.out.println("// ---- CHECKING ALLOWANCE FOR EXAM ---- //");
    }

    public double getNumberOfClassesHeld() {
        return numberOfClassesHeld;
    }

    public void setNumberOfClassesHeld(double numberOfClassesHeld) {
        this.numberOfClassesHeld = numberOfClassesHeld;
    }

    public double getNumberOfClassesAttend() {
        return numberOfClassesAttend;
    }

    public void setNumberOfClassesAttend(double numberOfClassesAttend) {
        this.numberOfClassesAttend = numberOfClassesAttend;
    }
    public void inputNumberOfClasses(){
        Scanner student=new Scanner(System.in);
        System.out.print("Enter Number Of Classes Held : ");
        setNumberOfClassesHeld(student.nextDouble());
        System.out.print("Enter Number Of Classes Attend : ");
        setNumberOfClassesAttend(student.nextDouble());
    }
    public void checkAllowanceForExam(){
        double percentageOfClassesAttend=(getNumberOfClassesAttend()/getNumberOfClassesHeld())*100;
        System.out.println("Percentage of Attendance is : "+percentageOfClassesAttend);
        if (percentageOfClassesAttend<ProblemNumberFifteen.ALLOWANCE_ATTENDANCE_LIMIT){
            System.out.println("Not Allowed");
        }
        else {
            System.out.println("Congrats ! For ALLOWANCE");
        }
    }


}
