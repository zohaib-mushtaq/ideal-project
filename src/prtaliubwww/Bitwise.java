package prtaliubwww;

public class Bitwise {
    public static final int CS=1;
    public static final int MATH=2;
    public static final int PHY=4;
    public static final int CHEM=8;
    public static final int ENG=16;
    private int selection;
    public void setSelection(int selection){
        this.selection=selection;
    }
    public int getSelection(){
        return selection;
    }
}
