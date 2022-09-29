package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberEleven {
//    java program a company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount?

    public static final int YEAR_SERVICE_LIMIT=5;
    public static final int DISCOUNT=5;
    private int yearOfService;
    private double employeeSalary;
    public ProblemNumberEleven(){
        System.out.println("// ---- Enter Your Info For Bonus Checking ---- //");
    }
    public void setYearOfService(int yearOfService){
        this.yearOfService=yearOfService;
    }
    public int getYearOfService(){
        return yearOfService;
    }
    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary=employeeSalary;
    }
    public double getEmployeeSalary(){
        return employeeSalary;
    }
    public void inputInfo(){
        Scanner employee=new Scanner(System.in);
        System.out.print("Enter Employee Salary : ");
        setEmployeeSalary(employee.nextInt());
        System.out.print("Enter Employee Experience : ");
        setYearOfService(employee.nextInt());
    }
    public void netBonus(){
        double netBonusAmount;
        if (getYearOfService()>=ProblemNumberEleven.YEAR_SERVICE_LIMIT){
            System.out.println("Congrats ! You Got 5% Discount.");
            netBonusAmount=getEmployeeSalary()+((getEmployeeSalary()*ProblemNumberEleven.DISCOUNT)/100);
            System.out.println("Net Bonus Amount is : "+netBonusAmount);
        }
        else {
            System.out.println("Sorry ! No Discount.");
            netBonusAmount=(getEmployeeSalary());
            System.out.println("Net Bonus Amount is : "+netBonusAmount);

        }
    }
}
