package prtaliubwww;

public class FontStyle {
    public static final int BOLD=1;
    public static final int ITALIC=2;
    public static final int UNDERLINE=4;
    public static final int STRIKE_THROUGH=8;
    private int fontStyle;
    public FontStyle(){
    }
//    Here is Constructor
    public FontStyle(int fontStyle){
        this.fontStyle=fontStyle;
    }
//    Here all applications of font styles
    public void boldApplication(){
        this.fontStyle=fontStyle^FontStyle.BOLD;
    }
    public void italicApplication(){
        this.fontStyle=fontStyle^FontStyle.ITALIC;
    }
    public void underLineApplication(){
        this.fontStyle=fontStyle^FontStyle.UNDERLINE;
    }
    public void strikeThroughApplication(){
        this.fontStyle=fontStyle^FontStyle.STRIKE_THROUGH;
    }
//    Getter and Setter for font style
    public void setFontStyle(int fontStyle){
        this.fontStyle=fontStyle;
    }
    public int getFontStyle(){
        return fontStyle;
    }
}
