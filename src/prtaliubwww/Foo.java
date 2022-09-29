package prtaliubwww;
import java.util.Scanner;
public class Foo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        boolean b=sc.hasNextInt();
        System.out.println(b);
        int number=sc.nextInt();
        sc.nextLine();
        System.out.println("Please ! Enter your name :");
        String name=sc.nextLine();
        System.out.println(" number is :"+number);
        System.out.println("Name is : "+name);
    }
}
