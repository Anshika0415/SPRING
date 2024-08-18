package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("arsh")
    String name;


    /*there are 3 types of Dependency injection 1. field (the way we are doing rn) 2.Constructor
        (Create a constructor and pass com) 3. usong @autowire anno on top of setCom()
         */
   // @Autowired
   // @Qualifier("desktop")
    //Computer com;
    @Autowired
    public Alien(Computer com)
    {
        com.compile();
    }

//    public Computer getCom() {
//        return com;
//    }
//    //@Autowired
//    public void setCom(Computer com) {
//        this.com = com;
//    }

    void myIntro()
    {
        System.out.println("Hi I am Alien.. I code");
        System.out.println(name);

    }
    void code()
    {
        System.out.println("coding..");
        //com.compile();
    }
}
