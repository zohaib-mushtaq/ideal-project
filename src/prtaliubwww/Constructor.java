package prtaliubwww;

public class Constructor {
    String name;
    int rollNo;
    // Constructor is used to initialize an object
    public Constructor(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public static void main(String[] args){
        Constructor obj=new Constructor("Zohaib",13);
        System.out.println("Name of Student is :"+"  "+obj.name);
        System.out.println("Roll no of Student is :"+"  "+obj.rollNo);
    }
}
