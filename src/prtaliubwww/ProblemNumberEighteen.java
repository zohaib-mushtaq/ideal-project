package prtaliubwww;

import java.util.Scanner;

public class ProblemNumberEighteen {
    public char getEnterCharacter() {
        return enterCharacter;
    }

    public void setEnterCharacter(char enterCharacter) {
        this.enterCharacter = enterCharacter;
    }

    private char enterCharacter;
    public ProblemNumberEighteen(){

    }
    public void inputCharacter(){
        Scanner enterCharacter=new Scanner(System.in);
        System.out.print("Enter Lower Case or Upper Case Character : ");
        setEnterCharacter(enterCharacter.next().charAt(0));
    }

    public void checkCharacter(){


        if (enterCharacter=='A' || enterCharacter=='B' || enterCharacter=='C' || enterCharacter=='D'|enterCharacter=='E' | enterCharacter=='F' | enterCharacter=='G' | enterCharacter=='H'|enterCharacter=='I' | enterCharacter=='J' | enterCharacter=='K' | enterCharacter=='L'|enterCharacter=='M' | enterCharacter=='N' | enterCharacter=='O' | enterCharacter=='P'|enterCharacter=='Q' | enterCharacter=='R' | enterCharacter=='S' | enterCharacter=='T'|enterCharacter=='U' | enterCharacter=='V' | enterCharacter=='W' | enterCharacter=='X'|enterCharacter=='Y' | enterCharacter=='Z' ){
            System.out.println(enterCharacter+" : "+"Character is Upper Case");
        }
        else if (enterCharacter=='a' | enterCharacter=='b' | enterCharacter=='c' | enterCharacter=='d'|enterCharacter=='e' | enterCharacter=='f' | enterCharacter=='g' | enterCharacter=='h'|enterCharacter=='i' | enterCharacter=='j' | enterCharacter=='k' | enterCharacter=='l'|enterCharacter=='m' | enterCharacter=='n' | enterCharacter=='o' | enterCharacter=='p' | enterCharacter=='q' | enterCharacter=='r'|enterCharacter=='s' | enterCharacter=='t' | enterCharacter=='u' | enterCharacter=='v'|enterCharacter=='w' | enterCharacter=='x' | enterCharacter=='y' | enterCharacter=='z'){
            System.out.println(enterCharacter+" : "+"Character is Lower Case");
        }
        else {
            System.out.println("Invalid Input !");
        }

    }

}
