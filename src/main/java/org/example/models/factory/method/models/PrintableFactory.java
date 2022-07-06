package org.example.models.factory.method.models;

public class PrintableFactory {

    /*Static Factory method that returns an object of another class*/
    public static Printable getPrintable(){
        return new PaperPrinter();
        //return new BoardPrinter();
    }

    /*non-Static Factory method that returns an object of another class*/
    public Printable getNonStaticPrintable(){
        //return new PaperPrinter();
        return new BoardPrinter();
    }


}
