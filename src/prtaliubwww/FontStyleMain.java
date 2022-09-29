package prtaliubwww;

public class FontStyleMain {
    public static void main(String[] args){
        FontStyle fontStyle=new FontStyle(FontStyle.BOLD | FontStyle.ITALIC);
        System.out.println(fontStyle.getFontStyle());
        fontStyle.italicApplication();
        System.out.println(fontStyle.getFontStyle());
        fontStyle.underLineApplication();
        System.out.println(fontStyle.getFontStyle());
    }
}
