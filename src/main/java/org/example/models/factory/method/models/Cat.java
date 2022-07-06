package org.example.models.factory.method.models;

public class Cat {
    private static final Cat cat = new Cat();

    private Cat(){
        System.out.println("Private Constructor to make this class is a singleton class");
    }
    //static factory method that returns instance of its own class
    public static Cat getCat(){
        System.out.println("Calling to factory method");
        return cat;
    }

    public void msg(){
        System.out.println("Hello Kitty");
    }
}
