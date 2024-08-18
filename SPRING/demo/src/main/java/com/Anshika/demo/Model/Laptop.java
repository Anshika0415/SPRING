package com.Anshika.demo.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //this is component for DI or dependency injection
@Primary
public class Laptop implements Computer {
    @Override
    public void Compile()
    {
        System.out.println("Compiling using laptop..");
    }
}
