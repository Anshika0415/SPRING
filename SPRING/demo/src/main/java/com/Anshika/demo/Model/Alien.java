package com.Anshika.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component    //this tells spring that we need object of this class from IOC container
@Scope("prototype")
public class Alien {
    @Value("35")
    private int age;
    //spring doesn't create object for all the classes on its own unless @Component annotation is used


    Computer com;    //context.getBean() can only be used in main method in other cases we do autowiring

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    void code()
    {
        com.Compile();
        System.out.println("coding..");
    }
}
