package prtaliubwww;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
     char c1='A';
     char c2='B';
     int a;
     int p;
     // Packing
     a=c1;
     a=a<<16;
     a=a|c2;
     System.out.println(a);
     //Unpacking
     p=a>>16;
     c1=(char)p;
     c2=(char)a;
     System.out.println(c1);
     System.out.println(c2);


    }
}
