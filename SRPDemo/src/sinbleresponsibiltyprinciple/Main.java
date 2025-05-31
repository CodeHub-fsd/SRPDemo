package sinbleresponsibiltyprinciple;

import sinbleresponsibiltyprinciple.Formatter;

public class Main {


    public static void main(String[] args){
       // sinbleresponsibiltyprinciple.Magzine magzine=new sinbleresponsibiltyprinciple.Magzine();
        //magzine.formatMagzine();
      //  magzine.print();

        Formatter format =new Formatter();
        format.formatMagzine();

        Printer res=new Printer();
        res.print();
    }
}
