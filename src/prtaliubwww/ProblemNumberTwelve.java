package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberTwelve {
//    a java program a school has following rules for grading system:
// Below 25 - F
// 25 to 45 - E
// 45 to 50 - D
// 50 to 60 - C
// 60 to 80 - B
// Above 80 - A
//Ask user to enter marks and print the corresponding grade?
    public static final int GRADE_A=80;
    public static final int GRADE_B=60;
    public static final int GRADE_C=50;
    public static final int GRADE_D=45;
    public static final int GRADE_E=25;
    private int studentMarks;
    public ProblemNumberTwelve(){
        System.out.println("// ---- School Grading System ---- //");
    }
    public void setStudentMarks(int studentMarks){
        this.studentMarks=studentMarks;
    }
    public int getStudentMarks(){
        return studentMarks;
    }
    public void inputStudentMarks(){
        Scanner student=new Scanner(System.in);
        System.out.print("Enter Marks : ");
        setStudentMarks(student.nextInt());
    }
    public void gradingSystem(){
        if (getStudentMarks()>=ProblemNumberTwelve.GRADE_A){
            System.out.println("Congrats ! You Got Grade : 'A' ");
        }
        else if (getStudentMarks()<ProblemNumberTwelve.GRADE_A && getStudentMarks()>=ProblemNumberTwelve.GRADE_B) {
            System.out.println("Congrats ! You Got Grade : 'B' ");
        }
        else if (getStudentMarks()<ProblemNumberTwelve.GRADE_B && getStudentMarks()>=ProblemNumberTwelve.GRADE_C) {
            System.out.println("Congrats ! You Got Grade : 'C' ");
        }
        else if (getStudentMarks()<ProblemNumberTwelve.GRADE_C && getStudentMarks()>=ProblemNumberTwelve.GRADE_D) {
            System.out.println("Congrats ! You Got Grade : 'D' ");
        }
        else if (getStudentMarks()<ProblemNumberTwelve.GRADE_D && getStudentMarks()>=ProblemNumberTwelve.GRADE_E) {
            System.out.println("Congrats ! You Got Grade : 'E' ");
        }
        else if (getStudentMarks()<ProblemNumberTwelve.GRADE_E) {
            System.out.println("Congrats ! You Got Grade : 'F' ");
        }
        else {
            System.out.println("Sorry ! Invalid Input");
        }
    }
}
