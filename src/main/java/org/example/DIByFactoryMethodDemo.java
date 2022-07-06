package org.example;

import org.example.models.factory.method.models.Cat;
import org.example.models.factory.method.models.Printable;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  > Dependency Injection by factory method
 *    * Spring framework provides facility to inject bean using factory method.
 *    * The factory-method can be used to define the method that should be used to create this bean (instead of calling the constructor)
 *    * To do so, we can use two attributes of bean element.
 *          1. factory-method : represents factory method that will be invoked to inject the bean
 *          2. factory-bean : represents the reference of the bean by which factory method will be invoked.
 *          It is used if factory method is non-static
 *
 *     * Factory method types
 *          1. A static factory method that returns instance of its own class. It is used in singleton design pattern.
 *          2. A static factory method that returns instance of another class. It is used instance is not known and decided at runtime.
 *          3. A non-static factory method that returns instance of another class. It is used instance is not known and decided at runtime.
 *
 *      * A method that returns instance of a class is called factory method.
 */
public class DIByFactoryMethodDemo {

    public static void demo(){
        demoOne();
        demoTwo();
        demoThree();
    }

    /* dependency injection by static factory method that returns the instance of own class.*/
    public static void demoOne(){
        System.out.println("\nDependency injection by static factory method that returns the instance of own class");

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
            Cat cat = (Cat)applicationContext.getBean("cat");
            cat.msg();

        }catch (BeansException ex){
            System.out.println("Exception : "+ ex.getMessage());
        }
    }

    /* Dependency injection by static factory method that returns the instance of another class.*/
    public static void demoTwo(){

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            System.out.println("\nDependency injection by static factory method that returns the instance of another class.");
            Printable printable = (Printable) applicationContext.getBean("printer");
            printable.print();

        } catch (BeansException ex) {

            System.out.println("Exception : " + ex.getMessage());
        }
    }

    /* Dependency injection by non-static factory method that returns the instance of another class.*/
    public static void demoThree(){
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
            System.out.println("\nDependency injection by non-static factory method that returns the instance of another class.");
            Printable printable = (Printable) applicationContext.getBean("nonStaticPrinter");
            printable.print();

        }catch (BeansException ex){
            System.out.println("Exception : "+ ex.getMessage());
        }
    }
}
