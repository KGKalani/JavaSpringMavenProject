package org.example;

import org.example.models.Employee;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ----- Spring Framework -----
 * > Spring Framework is an open-source application framework
 *   that provides all feature to develop loosely coupled, cross-platform
 *   java enterprise application that run in any environment
 *
 * > Main feature of Spring Framework is Dependency Injection (DI)
 *
 * ----- Inversion of Control (IoC) -----
 * > Spring Framework has IOC container which is responsible to instantiate, configure and assemble the objects
 * > The IoC container gets information from the XML file and works accordingly.
 * > Main tasks performed by IoC container are:
 *      * to instantiate the application class
 *      * to configure the object
 *      * to assemble the dependencies between the objects
 *
 * > There are two types of IoC containers. They are:
 *      1. BeanFactory - For a small app
 *      2. ApplicationContext - For an enterprise app/web app, use ApplicationContext (This is super set of BeanFactory)
 *
 * > There are 3 types of configuration which are used to provide configuration metadata to the Spring Container
 *      1. XML based config file
 *      2. Annotation based config
 *      3. Java based config
 *
 * > Ways to inject dependencies
 *      1. By Constructor (Constructor Injection)
 *      2. By Setter method (Property Injection)
 *
 *  > Autowiring
 *      * Autowiring feature of spring framework enables you to inject the object dependency implicitly.
 *      * It internally uses setter or constructor injection.
 *      * Autowiring can't be used to inject primitive and string values. It works with reference only.
 *
 *  > Dependency Injection by factory method
 *  Spring framework provides facility to inject bean using factory method.
 *  To do so, we can use two attributes of bean element.
 *      1. factory-method : represents factory method that will be invoked to inject the bean
 *      2. factory-bean : represents the reference of the bean by which factory method will be invoked.It is used if factory method is non-static
 *
  */
public class SpringFrameworkDemo {
    public static void demo(){
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
           /* ApplicationContext applicationContext
                    = new ClassPathXmlApplicationContext("applicationContext.xml");*/

            /*Xml based config demo*/
            System.out.println("*** XML based spring config ***");
            Employee teacher = (Employee) applicationContext.getBean("teacher");
            teacher.getEmployeeDetails();

            /*Annotation based config*/
            System.out.println("\n*** Annotation based spring config ***");
            Employee nonAcademicStaff = (Employee) applicationContext.getBean("nonAcademicStaff");
            nonAcademicStaff.getEmployeeDetails();

            /*DI - Property Injection*/
            System.out.println("\n*** DI - Property Injection ***");
            Employee teacher1 = (Employee) applicationContext.getBean("teacher1");
            System.out.println(teacher1);

            /*DI - Constructor Injection*/
            System.out.println("\n*** DI - Constructor Injection ***");
            Employee teacher2 = (Employee) applicationContext.getBean("teacher2");
            System.out.println(teacher2);

            /*DI - Autowiring*/
            System.out.println("\n*** Autowiring ***");
            System.out.println(nonAcademicStaff);

            /*Dependency Injection by factory method*/
            System.out.println("\n*** Dependency Injection by factory method demo ***");
            DIByFactoryMethodDemo.demo();

        }catch (BeansException bex){
            System.out.println("Exception : " + bex.getMessage());
        }
    }
}
