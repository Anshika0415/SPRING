package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {   //by default beans are singleton


        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //Desktop dt=context.getBean("desktop",Desktop.class);
//        Desktop dt=context.getBean("com1",Desktop.class);
//        dt.compile();
//        Desktop dt1=context.getBean(Desktop.class);
//        Desktop dt2=context.getBean(Desktop.class);
//        dt1.setName("Arshdeep");
//        dt2.setName("Anshika");
//        System.out.println(dt1.getName());
//        System.out.println(dt2.getName());

        Alien ob=context.getBean(Alien.class);


    }
}
