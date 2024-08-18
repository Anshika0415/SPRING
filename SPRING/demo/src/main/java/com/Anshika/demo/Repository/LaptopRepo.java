package com.Anshika.demo.Repository;

import com.Anshika.demo.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void saveLaptop(Laptop lap)
    {
        System.out.println("Repo method called");
        lap.Compile();
    }
}
