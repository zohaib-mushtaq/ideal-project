package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberThirteen { //    a java program take input of age of 3 people by user and determine oldest and youngest among them?
    public int getFirstPersonAge() {
        return firstPersonAge;
    }

    public void setFirstPersonAge(int firstPersonAge) {
        this.firstPersonAge = firstPersonAge;
    }

    public int getSecondPersonAge() {
        return secondPersonAge;
    }

    public void setSecondPersonAge(int secondPersonAge) {
        this.secondPersonAge = secondPersonAge;
    }

    public int getThirdPersonAge() {
        return thirdPersonAge;
    }

    public void setThirdPersonAge(int thirdPersonAge) {
        this.thirdPersonAge = thirdPersonAge;
    }
    private int firstPersonAge;
    private int secondPersonAge;
    private int thirdPersonAge;

    public String getPersonOneName() {
        return personOneName;
    }

    public void setPersonOneName(String personOneName) {
        this.personOneName = personOneName;
    }

    public String getPersonTwoName() {
        return personTwoName;
    }

    public void setPersonTwoName(String personTwoName) {
        this.personTwoName = personTwoName;
    }

    public String getPersonThreeName() {
        return personThreeName;
    }

    public void setPersonThreeName(String personThreeName) {
        this.personThreeName = personThreeName;
    }

    private String personOneName;
    private String personTwoName;
    private String personThreeName;

    public ProblemNumberThirteen(){
        System.out.println("// ---- Determining oldest and youngest ---- //");
    }

    public void inputFistPerson(){
        Scanner person=new Scanner(System.in);
        System.out.print("Enter Name Of First Person : ");
        setPersonOneName(person.nextLine());
        System.out.print("Enter Age Of "+getPersonOneName()+" : ");
        setFirstPersonAge(person.nextInt());
    }
    public void inputSecondPerson(){
        Scanner person=new Scanner(System.in);
        System.out.print("Enter Name Of Second Person : ");
        setPersonTwoName(person.nextLine());
        System.out.print("Enter Age Of "+getPersonTwoName()+" : ");
        setSecondPersonAge(person.nextInt());
    }
    public void inputThirdPerson(){
        Scanner person=new Scanner(System.in);
        System.out.print("Enter Name Of Third Person : ");
        setPersonThreeName(person.nextLine());
        System.out.print("Enter Age Of "+getPersonThreeName()+" : ");
        setThirdPersonAge(person.nextInt());
    }
    public void determiningAge(){
        if (getFirstPersonAge()>getSecondPersonAge() && getFirstPersonAge()>getThirdPersonAge()){
            System.out.println(getPersonOneName()+" is Oldest");
            if (getSecondPersonAge()>getThirdPersonAge()){
                System.out.println(getPersonThreeName()+" is Younger than "+getPersonTwoName());
            }
            else if (getSecondPersonAge()==getThirdPersonAge()) {
                System.out.println(getPersonTwoName()+" & "+getPersonThreeName()+" : "+"are equal in Age");

            }
            else if (getThirdPersonAge()>getSecondPersonAge()) {
                System.out.println(getPersonTwoName()+" : "+"is Younger than "+getPersonThreeName());
            }
            else
            {
                System.out.println(getPersonTwoName()+" is Youngest");
            }
        }
        else if (getSecondPersonAge()>getFirstPersonAge() && getSecondPersonAge()>getThirdPersonAge()) {
            System.out.println(getPersonOneName()+" is Oldest");
            if (getThirdPersonAge()>getFirstPersonAge()){
                System.out.println(getPersonOneName()+"is Younger than "+getPersonThreeName());
            }
            else if (getFirstPersonAge()==getThirdPersonAge()) {
                System.out.println(getPersonOneName()+" & "+getPersonThreeName()+" : "+"are equal in Age");
            } else {
                System.out.println(getPersonTwoName()+"is Youngest");
            }
        }
        else if (getThirdPersonAge()>getFirstPersonAge() && getThirdPersonAge()>getSecondPersonAge()) {
            System.out.println(getPersonThreeName()+" is Oldest");
            if (getFirstPersonAge()>getSecondPersonAge()){
                System.out.println(getPersonTwoName()+" is Younger than "+getPersonOneName());
            }
            else if (getFirstPersonAge()==getSecondPersonAge()) {
                System.out.println(getPersonOneName()+" & "+getPersonTwoName()+" : "+"are equal in Age");
            } else {
                System.out.println(getPersonOneName()+" "+" is Youngest");
            }
        }
        else if (getFirstPersonAge()==getSecondPersonAge() && getFirstPersonAge()>getThirdPersonAge() ) {
            System.out.println(getPersonOneName()+" & "+getPersonTwoName()+" "+"are equal in Age Where "+" "+getPersonThreeName()+" "+"is Youngest");
        }
        else if (getSecondPersonAge()==getThirdPersonAge() && getSecondPersonAge()>getFirstPersonAge()) {
            System.out.println(getPersonTwoName()+" & "+getPersonThreeName()+" "+"are equal in Age Where "+" "+getPersonOneName()+" "+"is Youngest");
        }
        else if (getFirstPersonAge()==getThirdPersonAge() && getFirstPersonAge()>getSecondPersonAge()) {
            System.out.println(getPersonOneName()+" & "+getPersonThreeName()+" "+"are equal in Age Where "+" "+getPersonTwoName()+" "+"is Youngest");
        }
        else if (getFirstPersonAge()==getSecondPersonAge() && getFirstPersonAge()<getThirdPersonAge()) {
            System.out.println(getPersonOneName()+" & "+getPersonTwoName()+" "+"are equal in Age Where "+" "+getPersonThreeName()+" "+"is Oldest");

        }
        else if (getSecondPersonAge()==getThirdPersonAge() && getSecondPersonAge()<getFirstPersonAge()) {
            System.out.println(getPersonTwoName()+" & "+getPersonThreeName()+" "+"are equal in Age Where "+" "+getPersonOneName()+" "+"is Oldest");
        }
        else if (getFirstPersonAge()==getThirdPersonAge() && getFirstPersonAge()<getSecondPersonAge()) {
            System.out.println(getPersonOneName()+" & "+getPersonThreeName()+" "+"are equal in Age Where "+" "+getPersonTwoName()+" "+"is Oldest");
        }
        else if (getFirstPersonAge()==getSecondPersonAge() && getSecondPersonAge()==getThirdPersonAge()) {
            System.out.println(getPersonOneName()+" , "+getPersonTwoName()+" & "+getPersonThreeName()+" : "+"are equal in Age.");
        }
    }
}
