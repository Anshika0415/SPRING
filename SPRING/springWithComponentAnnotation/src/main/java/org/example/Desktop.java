package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling using Desktop..");
    }
}
