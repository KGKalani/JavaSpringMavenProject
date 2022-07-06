package org.example.models.factory.method.models;

public class BoardPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("Board Printing...");
    }
}
