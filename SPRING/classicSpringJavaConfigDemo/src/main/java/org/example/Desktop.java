package org.example;

public class Desktop implements Computer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compile()
    {
        System.out.println("Compiling using Desktop..");
    }
}
