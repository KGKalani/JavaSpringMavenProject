package org.example.models.factory.method.models;

public class PaperPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("Printing Paper....");
    }
}
