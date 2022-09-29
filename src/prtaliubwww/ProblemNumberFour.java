package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberFour {
//    Java program to read the age of a candidate and determine whether it is eligible for casting his/her own vote?
    public static final int VOTE_AGE_LIMIT=18;
    private int candidateAge;
    public ProblemNumberFour(){

    }
    public void setCandidateAge(int candidateAge){
        this.candidateAge=candidateAge;
    }
    public int getCandidateAge(){
        return candidateAge;
    }
    public void inputAge(){
        Scanner candidateAge=new Scanner(System.in);
        System.out.print("Enter The Age Of Candidate :");
        setCandidateAge(candidateAge.nextInt());
    }
    public void checkVoteCasting(){
        if (getCandidateAge()>=ProblemNumberFour.VOTE_AGE_LIMIT){
            System.out.println("Candidate Is Eligible For Vote Casting !");
        }
        else if (getCandidateAge()<ProblemNumberFour.VOTE_AGE_LIMIT) {
            System.out.println("Sorry ! Candidate Is Eligible For Vote Casting.");
        }
        else {
            System.out.println("Invalid Input ! ");
        }
    }
}
