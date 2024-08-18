package com.Anshika.demo.Service;

import com.Anshika.demo.Model.Laptop;
import com.Anshika.demo.Repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   //here we can use both service n component anno to create bean of this class automatically
public class AppApplicationService {
    @Autowired
    LaptopRepo repo;
    public void addLaptop(Laptop lap) {
        System.out.println("method called");
        repo.saveLaptop(lap);
    }
}
