package prtaliubwww;

public class MainBitwise {
    public static void main(String[] args){
      Bitwise zohaibEnrollment=new Bitwise();
      Bitwise AliEnrollment=new Bitwise();
      zohaibEnrollment.setSelection(Bitwise.CS | Bitwise.MATH);
      AliEnrollment.setSelection(Bitwise.MATH | Bitwise.ENG);
      System.out.println(zohaibEnrollment.getSelection() & AliEnrollment.getSelection());
      System.out.println(zohaibEnrollment.getSelection() | AliEnrollment.getSelection());
      System.out.println(zohaibEnrollment.getSelection() ^ AliEnrollment.getSelection());
    }
}
