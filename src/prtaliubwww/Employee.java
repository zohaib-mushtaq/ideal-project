package prtaliubwww;

import java.util.Scanner;

public class Employee {
    public static final int BONUS_SCALE_LIMIT=12;
    public static final int BONUS_EXPERIENCE_LIMIT=5;
    private String employeeName;
    private int employeeScale;
    private int employeeExperience;
    public Employee(){

    }
    public Employee(String employeeName, int employeeExperience,int employeeScale){
        this.employeeName=employeeName;
        this.employeeExperience=employeeExperience;
        this.employeeScale=employeeScale;
    }
    public void employeeInput(){
        Scanner employee=new Scanner(System.in);
        System.out.print("Enter Name of Employee : ");
        setEmployeeName(employee.nextLine());
        System.out.print("Enter Scale Of Employee : ");
        setEmployeeScale(employee.nextInt());
        System.out.print("Enter Experience Of Employee : ");
        setEmployeeExperience(employee.nextInt());
    }
    public void showBonus(){
        if (getEmployeeExperience()>=Employee.BONUS_EXPERIENCE_LIMIT && getEmployeeScale()>=Employee.BONUS_SCALE_LIMIT){
            System.out.println(getEmployeeName()+" : "+"CONGRATULATIONS FOR BONUS");
        }
        else {
            System.out.println(getEmployeeName()+" : "+"Sorry , NO BONUS");
        }
    }
    public void setEmployeeName(String name){
        employeeName=name;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeScale(int employeeScale){
        this.employeeScale=employeeScale;
    }
    public int getEmployeeScale(){
        return employeeScale;
    }
    public void setEmployeeExperience(int employeeExperience){
        this.employeeExperience=employeeExperience;
    }
    public int getEmployeeExperience(){
        return employeeExperience;
    }
}
