package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); //this line creates a container and it looks for an xml file
        //in above line container and objects are created for all the classes
        Alien obj= (Alien) context.getBean("alien");
        Alien obj1= (Alien) context.getBean("alien1");
//        Alien obj = new Alien();

          obj1.execute();
          obj.age=21;
          obj.code();
          obj1.code();
        System.out.println(obj1.getAge());
        Desktop desk=context.getBean(Desktop.class); //we can call objects by name of class to avoid type casting
        desk.compile();

          /*There are two types of scope 1. Singleton(default) 2. prototype . Singleton beans are created
        when container is created/loaded but prototype bean is created only when we use getBean function.It is same as lazy-init.
        Singleton means that the object is same Prototype means that it is a different object reference*/
        /*In bean having id alien1 there are 2 property of class alien defiend ie. age n object
         for object we use reference to the original class.
         We have also called the parameterised constructor using <constructor-arg value="Anshika" /> and default
         constructor is not getting invoked*/

    }
}
