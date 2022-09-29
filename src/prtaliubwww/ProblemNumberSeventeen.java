package prtaliubwww;

public class ProblemNumberSeventeen {
//    If
//x = 2
//y = 5
//z = 0
//then find values of the following expressions:
//a. x == 2
//b. x! = 5
//c. x! = 5 && y >= 5
//d. z! = 0 || x == 2
//e.! (y < 10)

    public static final int x=2;
    public static final int y=5;
    public static final int z=0;
    public ProblemNumberSeventeen(){

    }
    public void checkValues(){
        if (x==2){
            System.out.println("Expression 'x==2' is :  TRUE");
        }
        else if (x != 5) {
            System.out.println("Expression 'x != 5' is :TRUE");
        }
        else if (x != 5 && y >= 5) {
            System.out.println("Expression 'x != 5 && y >= 5' is :TRUE");
        }
        else if (z != 0 || x == 2) {
            System.out.println("Expression 'z != 0 || x == 2' is :TRUE");
        }
        else if ( !(y < 10) ){
            System.out.println("Expression '!(y < 10)' is :TRUE");
        }
        else {
            System.out.println("Not Matched ! ");
        }
    }

}
