package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    int age;
    private String name;
    private Computer lap1;
    private Computer desk1;
    public void setLap1(Computer lap) {
        this.lap1 = lap;
    }


    public void setDesk1(Computer desk) {
        this.desk1 = desk;
    }


    public int getAge() {
        return age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public void setAge(int age) {
        //used with property tag in spring.xml
        System.out.println("Setter called");
        this.age = age;
    }

    public Alien()
    {
        System.out.println("object created");
    }
//    @ConstructorProperties({"name","lap"})
//    public Alien(String name, Laptop lap)
//    {
//        this.name=name;
//        System.out.println(name);
//        this.lap=lap;
//    }
    void code()
    {
        System.out.println(age);
        System.out.println("coding");
    }
    void execute()
    {
        System.out.println("executed");
        lap1.compile();
        desk1.compile();
    }

}
